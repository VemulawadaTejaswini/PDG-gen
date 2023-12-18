import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int[] a = new int[n];

    for (int i=0;i<n;i++){
      a[i] = scan.nextInt();
    }
    ArrayList<Integer> g = new ArrayList<Integer>();
    ArrayList<Integer> b = much(0,a,0,1000,n,g,0);

    Collections.sort(b);
    System.out.println(b.get(b.size()-1));
  }

  static ArrayList<Integer> much(int current,int[] price, int inventory, int money, int n, ArrayList<Integer> m,int enter){
    if (current == n-1){
      money += price[n-1]*inventory;
      m.add(money);
      return m;
    }

    if (inventory == 0){
      int y = (int) money/price[current];
      int inventory1 = y;
      int money1 = (int) money - y*price[current];
      m = much(current+1,price,inventory1,money1,n,m,price[current]);
      m = much(current+1,price,0,money,n,m,0);
    }
    else{
      int now = price[current];
      m = much(current+1,price,inventory,money,n,m,enter);
      if (enter < now){
        int money2 = money + now*inventory;
        m = much(current+1,price,0,money2,n,m,0);
      }
    }
    return m;
  }

}
