import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int c = sc.nextInt();
        char[] arr = sc.next().toCharArray();
        int[] fronts = new int[k];
        int idx = 0;
        for (int i = 0; i < k; i++) {
            while (arr[idx] == 'x') {
                idx++;
            }
            fronts[i] = idx;
            idx += c + 1;
        }
        idx = n - 1;
        int[] reers = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            while(arr[idx] == 'x') {
                idx--;
            }
            reers[i] = idx;
            idx -= c + 1;
        }
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int i = 0; i < k; i++) {
            if (fronts[i] == reers[i]) {
                sb.append(fronts[i] + 1).append("\n");
                count++;
            }
        }
        if (count == 0) {
            System.out.println();
        } else {
            System.out.print(sb);
        }
    }
}
