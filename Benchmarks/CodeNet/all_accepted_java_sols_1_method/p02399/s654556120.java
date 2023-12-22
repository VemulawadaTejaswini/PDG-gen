import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String line = sc.nextLine();
    String[] abc = line.split(" ");
    int a = Integer.parseInt(abc[0]);
    int b = Integer.parseInt(abc[1]);
    int d = a / b;
    int r = a % b;
    double a1 = (double)a;
    double b1 = (double)b;
    double f =a1 / b1;
    System.out.println(d + " " + r + " " + String.format("%.5f", f));
  }
}
