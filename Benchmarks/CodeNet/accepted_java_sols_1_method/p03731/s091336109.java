import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String[] S = sc.nextLine().split(" ");
    int N = Integer.parseInt(S[0]);
    int M = Integer.parseInt(S[1]);
    
    String[] T = sc.nextLine().split(" ");
    int now = 0;
    int ans = 0;
    for(int i = 0; i < N; i++){
      int sec = Integer.parseInt(T[i]);
      if(now + M > sec && i != 0){
        ans += sec - now;
        now = sec;
      }else{
        ans += M;
        now = sec;
      }
    }
    System.out.println(ans);
  }
}