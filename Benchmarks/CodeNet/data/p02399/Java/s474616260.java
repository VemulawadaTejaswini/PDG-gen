import java.util.Scanner;
import java.lang.Math;

public class Main {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();

    System.out.print(a/b + " ");
    System.out.print(a%b + " ");
    double d = (double)a/(double)b;
    System.out.printf("%f",d);

    scan.close();
  }
}
