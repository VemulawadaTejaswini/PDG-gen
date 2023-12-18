import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] array = new long[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextLong();
            if (array[i] == 0) {
                System.out.println(0);
                return;
            }
        }
        long tmp = 1;
        for (int i = 0; i < n; i++) {
            if (tmp <= 1000000000000000000L / array[i]) {
                tmp *= array[i];
            } else {
                System.out.println(-1);
                return;
            }
        }
        System.out.println(tmp);
    }
}
