import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        long[] arr = new long[N];
        for (int i = 0; i < N; i++) {
            arr[i] = in.nextLong();
        }
        Arrays.sort(arr);
        long res = 1;
        boolean valid = true;
        for (int i = 0; i < N; i++) {
            if (1_000_000_000_000_000_000.0 / res < arr[i]) {
                valid = false;
            }
            res *= arr[i];
            if (res > 1_000_000_000_000_000_000L) {
                valid = false;
            }
        }
        System.out.println(valid ? res : -1);
    }
}