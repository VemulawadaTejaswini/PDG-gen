import java.util.Scanner;

/*

*/

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        double b = sc.nextDouble();
        double ans = Math.floor(a * (b * 100) / 100);

        System.out.println((long)ans);

    }
}