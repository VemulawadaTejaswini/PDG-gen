import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = Integer.parseInt(s.next());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            int p = Integer.parseInt(s.next());
            arr[i] = p;
        }
        int ret = Integer.MAX_VALUE;
        for (int x = 1; x <= 100; x++) {
            int tmp = 0;
            for (int a : arr) {
                tmp += Math.pow(a - x, 2);
            }
            if (tmp < ret) {
                ret = tmp;
            }
        }
        System.out.println(ret);
    }
}