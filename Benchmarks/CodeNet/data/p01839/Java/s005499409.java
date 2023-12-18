import java.util.*;

class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int count = 0;
    for (int i = 0; i < n; i++) {
      String s = sc.next();
      if (s.equals("A")) count++;
      else count--;
      if (count < 0) {
        System.out.println("NO");
        return;
      }
    }
    if (count == 0)
      System.out.println("YES");
    else
      System.out.println("NO");
  }
}

