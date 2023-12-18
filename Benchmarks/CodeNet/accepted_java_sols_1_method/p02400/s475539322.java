import java.util.Scanner;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double a = sc.nextDouble();
    double p = Math.PI;
    double answer1 = a*a*p;
    double answer2 = 2*a*p;
    System.out.printf("%f %f", answer1,answer2);
    sc.close();
  }
}

