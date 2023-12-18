import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();

    char[] c = s.toCharArray();

    Arrays.sort(c);

    for (int i = 0; i < s.length()-1; i++) {
      if (c[i] == c[i+1]) {
        System.out.println("no");
        return;
      }
    }

    System.out.println("yes");

  }

}
