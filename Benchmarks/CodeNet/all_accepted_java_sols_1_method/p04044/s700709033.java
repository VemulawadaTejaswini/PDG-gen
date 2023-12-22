import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int l = sc.nextInt();
    String[] line = new String[n];
    for (int cnt = 0; cnt < n; cnt++) {
      line[cnt] = sc.next();
    }
    Arrays.sort(line);
    for (int cnt = 0; cnt < n; cnt++) {
      System.out.print(line[cnt]);
    }
    sc.close();
  }
}