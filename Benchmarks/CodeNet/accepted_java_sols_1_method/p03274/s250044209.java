import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    String[] S = sc.nextLine().split(" ");
    int N = Integer.parseInt(S[0]);
    int K = Integer.parseInt(S[1]);
    int[] candle = new int[N];
    String[] T = sc.nextLine().split(" ");
    for(int i = 0; i < N; i++){
      candle[i] = Integer.parseInt(T[i]);
    }
    
    int ans = 2000000000;
    for(int i = 0; i <= N-K; i++){
      int a = Math.abs(candle[i]) + Math.abs(candle[i] - candle[i+K-1]);
      int b = Math.abs(candle[i+K-1]) + Math.abs(candle[i+K-1] - candle[i]);
      int min = Math.min(a, b);
      ans = ans > min ? min : ans;
    }    
    System.out.println(ans);
  }
}