import java.util.Scanner;

/*

*/

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long v = sc.nextLong();

        long b = sc.nextLong();
        long w = sc.nextLong();

        long t = sc.nextLong();

        b = Math.abs(a-b);
        a = 0;

        for (int i = 0; i < t; i++) {
            long temp_a = a - v;
            long temp_b = b - w;
            // long temp_a = b > a ? a + v : a - v;
            // long temp_b = b > a ? b + w : b - w;
            if (temp_a == temp_b) {
                System.out.println("YES");
                return;
            }
            b = Math.abs(temp_a - temp_b);
            a = 0;
        }

        System.out.println("NO");
    }
}