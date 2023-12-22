import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String S = sc.next();
    String T = sc.next();
    sc.close();

    StringBuffer ans = new StringBuffer();
    for (int i = 0; i < n; i++) {
      ans.append(S.charAt(i));
      ans.append(T.charAt(i));
    }

    System.out.println(ans.toString());
  }
}