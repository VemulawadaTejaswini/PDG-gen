import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    String[] S = sc.nextLine().split(" ");
    int ans = 0;
    for(int i = 0; i < N; i++){
      int n = Integer.parseInt(S[i]);
      while(n % 2 == 0){
        n /= 2;
        ans++;
      }
    }
    System.out.println(ans);
  }
}