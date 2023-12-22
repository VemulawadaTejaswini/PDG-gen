import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();
        sc.close();
        if (a>=b && a>=c) {
            System.out.println((int)(a*Math.pow(2,k)+b+c));
        }else if (b>=a && b>=c) {
            System.out.println((int)(b*Math.pow(2,k)+a+c));
        }else {
            System.out.println((int)(c*Math.pow(2,k)+a+b));
        }
    }
}