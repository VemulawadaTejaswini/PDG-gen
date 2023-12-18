import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; ++i) {
            arr[i] = scanner.nextInt();
        }

        boolean flag = true;
        int swapCnt = 0;
        while (flag) {
            flag = false;
            for (int i = n - 1; i > 0; --i) {
                if (arr[i] < arr[i - 1]) {
                    int tmp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = tmp;

                    flag = true;
                    ++swapCnt;
                }
            }
        }

        for (int i = 0; i < n; ++i) {
            System.out.printf("%d%s", arr[i], i == n - 1 ? "" : " ");
        }
        System.out.println();
        System.out.println(swapCnt);
    }
}

