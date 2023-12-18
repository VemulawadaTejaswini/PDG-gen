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
    for (int i=0;i<n;i++){
      for (int j=i+1;j<n;j++){
        if (a[j] > a[i]){
          p[i] = 1;
        }
      }
    }

    ArrayList<Integer> g = new ArrayList<Integer>();
    ArrayList<Integer> b = much(0,a,0,1000,n,g,0,p);

    Collections.sort(b);
    System.out.println(b.get(b.size()-1));
  }

  static ArrayList<Integer> much(int current,int[] price, int inventory, int money, int n, ArrayList<Integer> m,int enter,int[] p){
    if (current == n-1){
      money += price[n-1]*inventory;
      m.add(money);
      return m;
    }

    if (inventory == 0){
      int y = (int) money/price[current];
      int inventory1 = y;
      int money1 = (int) money - y*price[current];
      if ((price[current+1]>=price[current]) && (p[current] == 1)){
        m = much(current+1,price,inventory1,money1,n,m,price[current],p);
      }
      m = much(current+1,price,0,money,n,m,0,p);
    }
    else{
      int now = price[current];
      int now1 = price[current+1];
      if ((enter < now) && (now>now1)){
        int money2 = money + now*inventory;
        m = much(current+1,price,0,money2,n,m,0,p);
      }
      else{
        m = much(current+1,price,inventory,money,n,m,enter,p);
      }
    }
    return m;
  }

}
