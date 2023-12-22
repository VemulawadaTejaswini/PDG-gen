import java.util.*;

public class Main {
  public static void main(final String[] args) {
    final Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();

    String S = sc.next();
    char[] c = S.toCharArray();
    sc.close();

    int cnt =0;
    for (int i = 2; i < N; ++i) {
      if(c[i - 2] == 'A') {
        if(c[i - 1] == 'B') {
          if(c[i] == 'C'){
            ++cnt;
          }
        }
      }
    }

    System.out.println(cnt);
  }


}