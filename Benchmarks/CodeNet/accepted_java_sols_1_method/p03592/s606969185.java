import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    int M = Integer.parseInt(sc.next());
    int K = Integer.parseInt(sc.next());
    
    String ans = "No";
    for(int i = 0; i <= N; i++){
      for(int j = 0; j <= M; j++){
        int a = i*(M-j);
        int b = j*(N-i);
        if(a+b == K){
          ans = "Yes";
          break;
        }
      }
    }
    System.out.println(ans);
  }
}