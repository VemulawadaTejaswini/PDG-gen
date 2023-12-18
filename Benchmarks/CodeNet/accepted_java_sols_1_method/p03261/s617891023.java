import java.util.*;

class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    String s[] = new String[n];
    for (int i = 0; i < n; i++) {
      s[i] = sc.next();
      if (i > 0) {
        if (s[i-1].charAt(s[i-1].length()-1) != s[i].charAt(0)) {
          System.out.println("No");
          return;
        }
        for (int j = 0; j < i; j++) {
          if (s[j].equals(s[i])) {
            System.out.println("No");
            return;
          }
        }
      }
    }
    System.out.println("Yes");
  }
}
