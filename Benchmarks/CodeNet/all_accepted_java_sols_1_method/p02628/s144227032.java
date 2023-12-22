import java.util.*;

public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    
    int[] price = new int[N];
    for(int i=0;i<N;i++){
      price[i] = sc.nextInt();
    }
    
    Arrays.sort(price);
    
    int money = 0;
    for(int i=0;i<K;i++){
      money = money + price[i];
    }
    
    System.out.println(String.valueOf(money));
  }
}