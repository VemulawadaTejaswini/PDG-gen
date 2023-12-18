import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String[] S = sc.nextLine().split(" ");
    int N = Integer.parseInt(S[0]);
    int K = Integer.parseInt(S[1]);
    long[] val = new long[N];
    for(int i = 0; i < N; i++){
      val[i] = Long.parseLong(sc.next());
    }
    Arrays.sort(val);
    long ans = 0;
    for(int i = 0; i < N-K; i++){
      ans += val[i];
    }
    System.out.println(ans);
  }
}