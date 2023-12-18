import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x, y, z, GCD, GCD_n;
    x = sc.nextInt();
    y = sc.nextInt();
    if (x < y) { //swap
      z = x;
      x = y;
      y = z;
    }
    GCD = y;
    GCD_n = x % GCD;
    while(GCD_n != 0) {
      x = GCD;
      GCD = GCD_n;
      GCD_n = x % GCD;
    }
    System.out.println(GCD);
    sc.close();
  }
}

