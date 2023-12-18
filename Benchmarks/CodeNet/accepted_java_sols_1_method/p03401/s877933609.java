import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    String[] S = sc.nextLine().split(" ");
    int sum = 0;
    int[] num = new int[N+1];
    for(int i = 1; i <= N; i++){
      num[i] = Integer.parseInt(S[i-1]);
      sum += Math.abs(num[i]-num[i-1]);
    }
    sum += Math.abs(num[N]);
    for(int i = 1; i <= N; i++){
      int ans = sum;
      if(i != N){
        ans -= Math.abs(num[i]-num[i-1]);
        ans -= Math.abs(num[i]-num[i+1]);
        ans += Math.abs(num[i-1]-num[i+1]);
      }else{
        ans -= Math.abs(num[i]-num[i-1]);
        ans -= Math.abs(num[N]);
        ans += Math.abs(num[N-1]);
      }
      System.out.println(ans);
    }
  }
}