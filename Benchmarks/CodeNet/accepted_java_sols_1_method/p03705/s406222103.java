import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        // AGC 008 Simple Calculator
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt() - 1;
        long a = sc.nextInt();
        long b = sc.nextInt();

        if (a > b) {
            System.out.println(0);
            return;
        }
        if (n == 0 && a != b) {
            System.out.println(0);
            return;
        }

        long min = n * a + b;
        long max = a + n * b;

        System.out.println(max - min + 1);
    }
}