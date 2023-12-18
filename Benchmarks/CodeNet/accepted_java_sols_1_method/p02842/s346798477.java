import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    double r = Math.ceil(n / 1.08);
    if (Math.floor(r * 1.08) == n) {
      System.out.println((int) r);
    } else {
      System.out.println(":(");
    }
    sc.close();
  }
}
