
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        long ans2 = (long)((long)Math.pow(10, 9) + 7);
        long a = (long)Math.pow(10, num) % ans2;
        long b = (long)Math.pow(9, num) % ans2;
        long c = (long)Math.pow(8, num) % ans2;
        System.out.println(a - b - b + c);
    }
}