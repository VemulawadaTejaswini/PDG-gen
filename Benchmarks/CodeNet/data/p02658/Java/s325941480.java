import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args)throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    String[] S = sc.nextLine().split(" ");
    long ans = 1;
    long max = 1000000000000000000L;
    for(int i = 0; i < N; i++){
      long A = Long.parseLong(S[i]);
      if(ans > 0 || A == 0){
        ans *= A;
      }
    }
    ans = ans < 0 || ans > max ? -1 : ans;
    System.out.println(ans);
  }
}
