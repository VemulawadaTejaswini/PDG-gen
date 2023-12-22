import java.util.Scanner;

/*

*/

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        double b = sc.nextDouble();

        long std = a;
        if (a >= 100) {
        	a = a/100;
        }
        double ans = Math.floor(a * b);
        if (std >= 100) {
        	ans = ans*100;
        }
        System.out.println((long)ans);

    }
}