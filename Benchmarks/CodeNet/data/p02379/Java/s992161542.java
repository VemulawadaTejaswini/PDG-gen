
import java.util.Scanner;

class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int a;
        int b;

       
       a = x2 - x1 ;
       b = y2 - y1;
        double c = Math.sqrt(a * a + b * b);
        System.out.printf("%.8f",c);
    }

}

