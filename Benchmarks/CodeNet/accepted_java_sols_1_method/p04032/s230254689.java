import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    String s = sc.next();

    int n = s.length();
    char[] a = new char[n];
    a = s.toCharArray();

    for (int i = 0; i < n - 1; i++) {
      if (a[i] == a[i+1]) {
        System.out.println((i + 1) + " " + (i + 2));
        return;
      }
      if (i != n - 2 && a[i] == a[i+2]){
        System.out.println((i + 1) + " " + (i + 3));
        return;
      }
    }
    
    System.out.println("-1 -1");
  }
}