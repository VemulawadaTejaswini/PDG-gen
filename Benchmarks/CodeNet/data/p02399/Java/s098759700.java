import java.util.Scanner;
class Main{
  public static void main(String[] args){
  Scanner scanner = new Scanner(System.in);
  int a = scanner.nextInt();
  int b = scanner.nextInt();
  int d = a / b ;
  int r = a % b ;
  float f = (float)a / (float)b ;
  System.out.println(d);
  System.out.println(r);
  System.out.println(String.format("%.8f\n", f));
    }
  }