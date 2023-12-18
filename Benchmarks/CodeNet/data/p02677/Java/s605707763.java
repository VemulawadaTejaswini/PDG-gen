import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int h = sc.nextInt();
    int m = sc.nextInt();
    
    double angH = 30*h;
    double angM = 5.5*m;
    double ang = Math.abs(angH - angM) * 3.14 / 180;
    double c = 0;
    c = Math.sqrt(a*a + b*b - 2*a*b*Math.cos(ang));
    System.out.print(c);
  }
}
