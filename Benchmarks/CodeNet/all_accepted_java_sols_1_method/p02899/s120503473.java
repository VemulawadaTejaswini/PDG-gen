import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    int[] students = new int[n];

    for (int i = 0; i < n; i++) {
      students[i] = sc.nextInt();
    }

    int[] ordered = new int[n];
    for (int i = 0; i < n; i++) {
      int order = students[i];
      ordered[order - 1] = i + 1;
    }

    StringBuilder ret = new StringBuilder();
    for (int i = 0; i < n; i++) {
      ret.append(ordered[i]);
      if (i != n - 1) {
        ret.append(" ");
      }
    }
    System.out.println(ret.toString());
  }
}
