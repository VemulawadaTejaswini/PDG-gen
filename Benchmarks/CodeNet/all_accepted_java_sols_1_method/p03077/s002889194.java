import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long[] arr = new long[5];
        long min = Long.MAX_VALUE;
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextLong();
            min = Math.min(min, arr[i]);
        }
        System.out.println(5L + (long)Math.ceil((double)n / (double)min) - 1);
    }
}
