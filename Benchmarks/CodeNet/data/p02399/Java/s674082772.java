import java.util.Scanner;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    int a, b, d, r;
    a = sc.nextInt();
    b = sc.nextInt();

    double f;

    d = a/b ;
    r = a%b ;
    f = 1.00000 * a/b ;

    System.out.println( d + " " + r + " " + String.format("%.5f",f) );

    } 
}
