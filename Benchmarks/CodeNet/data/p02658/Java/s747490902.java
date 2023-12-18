import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        long sum = scan.nextLong();
        long max = (new Double(Math.pow(10, 18))).longValue();
        for (int i = 0; i < N - 1; i++) {
            long num = scan.nextLong();
            sum = sum * num;
        }
        if (sum >max) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
        }
    }
}

