import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = sc.next();
    char[] SS = S.toCharArray();
    for (int i=0; i<S.length(); i++) {
      if(SS[i] + N > 'Z') {
        SS[i] += N - 26;
      } else {
        SS[i] += N;
      }
      System.out.print(SS[i]);
    }
  }
}