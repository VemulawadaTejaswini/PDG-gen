import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String str = sc.next();
    char[] c = str.toCharArray();
    int sum = 700;

    for (int i = 0 ; i < str.length() ; i++ ) {
      if (c[i] == 'o') {
        sum += 100;
      }
    }
    System.out.println(sum);
  }
}
