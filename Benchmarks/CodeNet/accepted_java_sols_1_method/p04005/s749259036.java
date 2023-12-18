import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long ans;
        if (a % 2 == 0 || b % 2 == 0 || c % 2 == 0) {
            ans = 0;
        } else {
            long[] arr = {a, b, c};
            Arrays.sort(arr);
            ans = arr[0] * arr[1];
        }
        System.out.println(ans);
    }
}