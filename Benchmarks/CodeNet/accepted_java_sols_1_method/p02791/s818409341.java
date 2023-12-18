import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    String[] S = sc.nextLine().split(" ");
    int min = 100000000;
    int ans = 0;
    for(int i = 0; i < N; i++){
      int M = Integer.parseInt(S[i]);
      if(M <= min){
        min = M;
        ans++;
      }
    }
    System.out.println(ans);
  }
}