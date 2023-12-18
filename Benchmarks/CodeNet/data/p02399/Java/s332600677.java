import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    long a = scan.nextLong();
    long b = scan.nextLong();

    long d = a / b;
    long r = a % b;
    float f = (float) a / b;
    System.out.printf("%d %d %.8f",d,r,f);
  }
}