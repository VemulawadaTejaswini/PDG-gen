import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long fA = 0;
    long ans = 0;
    for (int cnt = 0; cnt < n; cnt++) {
      long a = Long.parseLong(sc.next());
      long dai = 0;
      if (fA > a) {
        dai = (fA - a);
        ans += dai;
      }
      fA = a + dai;
    }
    System.out.println(ans + "");
    sc.close();
  }
}