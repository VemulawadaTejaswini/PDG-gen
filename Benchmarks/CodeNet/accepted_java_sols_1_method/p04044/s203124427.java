import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int l = sc.nextInt();
    String[] line = new String[n + 1];
    for (int cnt = 0; cnt < n + 1; cnt++) {
      line[cnt] = sc.nextLine();
    }
    Arrays.sort(line);
    for (int cnt = 0; cnt < n + 1; cnt++) {
      System.out.print(line[cnt]);
    }
    sc.close();
  }
}