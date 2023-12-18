import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        long[] ary = new long[n];
        for (int i = 0; i < n; i++) {
            ary[i] = Long.parseLong(sc.next());
        }
        long sum = Arrays.stream(ary).sum();
        long sub = Long.MAX_VALUE;
        long temp = 0;
        long idx = 0;
        for (int i = 0; i < n - 1; i++) {
            temp += ary[i];
            sub = Math.min(sub, Math.abs(sum - temp - temp));
        }
        System.out.println(sub);
    }
}