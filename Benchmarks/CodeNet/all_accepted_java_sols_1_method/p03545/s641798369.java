import java.util.Scanner;

public class Main { 
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int a = S.charAt(0) - '0';
    int b = S.charAt(1) - '0';
    int c = S.charAt(2) - '0';
    int d = S.charAt(3) - '0';
    if (a -b -c - d ==7) System.out.printf ("%d-%d-%d-%d=7" ,a ,b ,c , d );
    else if (a -b - c + d ==7) System.out.printf ("%d-%d-%d+%d=7" ,a ,b ,c , d );
    else if (a - b +c - d ==7) System.out.printf ("%d-%d+%d-%d=7" ,a ,b ,c , d );
    else if (a - b + c + d ==7) System.out.printf ("%d-%d+%d+%d=7" ,a ,b ,c , d );
    else if ( a +b -c - d ==7) System.out.printf ("%d+%d-%d-%d=7" ,a ,b ,c , d );
    else if ( a +b - c + d ==7) System.out.printf ("%d+%d-%d+%d=7" ,a ,b ,c , d );
    else if ( a + b +c - d ==7) System.out.printf ("%d+%d+%d-%d=7" ,a ,b ,c , d );
    else if ( a + b + c + d ==7) System.out.printf ("%d+%d+%d+%d=7" ,a ,b ,c , d );
  }
}