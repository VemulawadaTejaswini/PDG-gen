import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();

        }
        boolean isFinish = false;
        int initial = 1;
        int result = 0;
        for (int i = 0; i < n; i++) {
            initial = a[initial - 1];
            result++;
            if (initial == 2) {
                isFinish = true;
                break;
            }
        }

        if (isFinish) {
            System.out.println(result);
        } else {
            System.out.println(-1);

        }
    }
}