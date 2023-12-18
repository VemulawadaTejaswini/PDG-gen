import java.util.*;
 
public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = sc.next();
    int K = sc.nextInt();
    char[] c = S.toCharArray();
    
    for (int i = 0; i < N; i++) {
      if (S.charAt(i) != S.charAt(K - 1)){
        c[i] = '*';
      }
    }
    for (int i = 0; i < N; i++){
      System.out.print(c[i]);
	}
  }
}