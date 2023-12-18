import java.util.Scanner;
import java.lang.Math;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int A = scan.nextInt();
    int B = scan.nextInt();
    int H = scan.nextInt();
    int M = scan.nextInt();
    scan.close();

    double rateH = (double)(60*H + M) / 720;
    double rateM = (double)M / 60;

    double rateDiff = Math.abs(rateH - rateM);
    if(rateDiff > 0.5) {
      rateDiff = 1 - rateDiff;
    }

    System.out.println(Math.sqrt(A*A + B*B -2*A*B*Math.cos(2*Math.PI*rateDiff)));
  }
}