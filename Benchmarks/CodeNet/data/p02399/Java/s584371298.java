import java.util.Scanner;

public class Main{
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    int a= scan.nextInt();
    int b= scan.nextInt();
    int d = a/b;
    int r = a%b;
    double f1 = a;
    double f2 = b;
    double f = f1/f2;
    System.out.println(d + " " + r + " " + String.format("%.5f", f));
  }
}
