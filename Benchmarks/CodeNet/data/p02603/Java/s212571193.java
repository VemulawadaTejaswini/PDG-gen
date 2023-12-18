import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int[] a = new int[n];

    for (int i=0;i<n;i++){
      a[i] = scan.nextInt();
    }

    int[] p = new int[n];
    int[] aa = new int[n];
    int[] bb = new int[n];
    boolean[] cc = new boolean[n];

    for (int i=0;i<n;i++){
      for (int j=i+1;j<n;j++){
        if (a[j] > a[i]){
          p[i] = 1;
          aa[i] = j;
          break;
        }
        if (a[j] < a[i]){
          if (cc[i] == false){
            cc[i] = true;
            bb[i] = j;
          }
          else{
            if (a[j] < a[bb[i]]){
              bb[i] = a[j];
            }
          }
        }
      }
    }

    ArrayList<Integer> g = new ArrayList<Integer>();
    ArrayList<Integer> b = much(0,a,0,1000,n,g,0,p,0,aa,bb,cc);

    Collections.sort(b);
    System.out.println(b.get(b.size()-1));
  }

  static ArrayList<Integer> much(int current,int[] price, int inventory, int money, int n, ArrayList<Integer> m,int enter,int[] p,int target, int[] aa,int[] bb, boolean[] cc){
    if (current == n-1){
      money += price[n-1]*inventory;
      m.add(money);
      return m;
    }

    if (inventory == 0){
      int y = (int) money/price[current];
      int inventory1 = y;
      int money1 = (int) money - y*price[current];

      int tt = 0;
      if (p[current] == 1){
        tt = aa[current];
        if (cc[current] == false){
          m = much(tt,price,inventory1,money1,n,m,price[current],p,tt,aa,bb,cc);
        }
        else{
          m = much(bb[current],price,0,money,n,m,0,p,tt,aa,bb,cc);
        }
      }
      else{
        m = much(current+1,price,0,money,n,m,0,p,tt,aa,bb,cc);
      }
    }
    else{
      int money2 = money + price[current]*inventory;
      int tt = 0;
      if (p[current] == 0){
        m.add(money2);
        return m;
      }

      if (cc[current] == false){
        m = much(current,price,0,money2,n,m,0,p,tt,aa,bb,cc);
      }
      else{
        m = much(bb[current],price,0,money2,n,m,0,p,tt,aa,bb,cc);
      }

    }
    return m;
  }

}
