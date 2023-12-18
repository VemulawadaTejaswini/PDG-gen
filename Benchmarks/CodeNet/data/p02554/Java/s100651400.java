
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        long ans = (long)(Math.pow(10, num) - Math.pow(9, num) - Math.pow(9, num) + Math.pow(8, num)) % (long)(Math.pow(10, 9) + 7);
        System.out.println(ans);
    }
}