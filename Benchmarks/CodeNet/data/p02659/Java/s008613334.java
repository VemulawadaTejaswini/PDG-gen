import java.util.Scanner;

/*

*/

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        double b = sc.nextDouble();
        long bb = Math.round(b * 100);
//        System.out.println(b * 100);
//        System.out.println(Math.floor(b * 100));
        long ans = a * bb / 100;

        System.out.println(ans);

    }
}