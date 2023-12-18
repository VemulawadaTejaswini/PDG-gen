import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();

    int d = a / b;
    int r = a % b;
    float f = (float) a / b;
    System.out.printf(%10d %10d %10.5f,d,r,f);
  }
}