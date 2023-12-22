import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        long b = sc.nextLong();
        long n = sc.nextLong();
        long x = Math.min(b - 1, n);

        System.out.println(x * a / b);
    }
}