import java.util.Scanner;

/*

*/

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        double b = sc.nextDouble();

        long ans = (long)(a * b * 100);

        System.out.println(Math.floor(ans / 100));

    }
}