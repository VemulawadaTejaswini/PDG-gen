import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String[] s = new String[n];
    for (int i = 0; i < n; i++) {
      s[i] = sc.next();
    }
    int m = sc.nextInt();
    String[] t = new String[m];
    for (int i = 0; i < m; i++) {
      t[i] = sc.next();
    }
    int max = 0;
    for (int i = 0; i < n; i++) {
      String st = s[i];
      int count = 0;
      for (int j = 0; j < n; j++) {
        if (s[j].equals(st)) count++;
      }
      for (int k = 0; k < m; k++) {
        if (t[k].equals(st)) count--;
      }
      if (count > max) max = count;
    }
    System.out.println(max);
  }
}