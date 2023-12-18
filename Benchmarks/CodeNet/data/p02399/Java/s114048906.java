import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int a = in.nextInt();
    int b = in.nextInt();
    int d = a / b;
    int r = a % b;
    double f = 1.0 * a / b;
    
    System.out.printf("%d %d %.5f",d,r,(double)f);
  }
}