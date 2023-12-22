import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    String[] S = sc.nextLine().split(" ");
    int N = Integer.parseInt(S[0]);
    int M = Integer.parseInt(S[1]);
    int ans = 1;
    int now = 0;
    String[] T = sc.nextLine().split(" ");
    for(int i = 0; i < N && now < M; i++){
      int n = Integer.parseInt(T[i]);
      now += n;
      if(now <= M){
        ans++;
      }
    }
    System.out.println(ans);
  }
}