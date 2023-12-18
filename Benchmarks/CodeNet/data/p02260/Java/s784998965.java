import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            int minj = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[minj] > arr[j]) {
                    minj = j;
                }
            }
            if (minj != i) {
                int tmp = arr[minj];
                arr[minj] = arr[i];
                arr[i] = tmp;
                count++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i > 0) {
                sb.append(" ");
            }
            sb.append(arr[i]);
        }
        System.out.println(sb);
        System.out.println(count);
    }
}
