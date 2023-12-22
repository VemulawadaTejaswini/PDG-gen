import java.util.*;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    char c[] = s.toCharArray();

    for (int i = 0 ; i < s.length() ; i++ ) {
      int a = (int)c[i] - 'A';
      a = (a + n) % 26;
      c[i] = (char)('A' + a);
      System.out.print(c[i]);
    }


  }
}
