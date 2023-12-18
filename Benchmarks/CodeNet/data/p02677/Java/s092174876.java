import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int h = sc.nextInt();
    int m = sc.nextInt();
    
    int angH = 30*h;
    int angM = 6*m;
    int ang = Math.abs(angH - angM);
    double c = 0;
    c = a*a + b*b - 2*a*b*Math.cos(ang);
    System.out.print(c);
  }
}
r