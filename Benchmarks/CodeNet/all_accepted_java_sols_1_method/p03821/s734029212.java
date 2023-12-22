import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    long[][] num = new long[N][2];
    for(int i = 0; i < N; i++){
      num[i][0] = Long.parseLong(sc.next());
      num[i][1] = Long.parseLong(sc.next());
    }
    
    long ans = 0;
    for(int i = N-1; i >= 0; i--){
      num[i][0] += ans;
      if(num[i][0] % num[i][1] != 0){
        long a = num[i][1] - num[i][0] % num[i][1];
        num[i][0] += a;
        ans += a;
      }
    }
    System.out.println(ans);
  }
}