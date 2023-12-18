import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    long[] memo = new long[N+1];
    memo[0] = 2;
    memo[1] = 1;
    for(int i = 2; i <= N; i++){
      memo[i] = memo[i-1] + memo[i-2];
    }
    System.out.println(memo[N]);
  }
}