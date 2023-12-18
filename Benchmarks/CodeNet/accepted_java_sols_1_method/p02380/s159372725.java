import java.util.Scanner;

public class Main {
    static double S,L,h;
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int C = sc.nextInt();
      double Crad = Math.toRadians(C);
      S = a * b * Math.sin(Crad) / 2;
      double cc = a * a + b * b - 2 * a * b * Math.cos(Crad);
      double c = Math.sqrt(cc);
      L = a + b + c;
      h = 2 * S / a;
      System.out.println(S + " " + L + " " + h);
    }
}
