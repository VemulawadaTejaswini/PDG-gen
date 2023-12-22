import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] h = new int[n];
        int min = 100;
        for (int i = 0; i < n; i++) {
            int temp = Integer.parseInt(sc.next());
            h[i] = temp;
            min = Math.min(min, temp);
        }
        int ans = min;
        for (int i = 0; i < n; i++) {
            h[i] -= min;
        }
        boolean allZ = false;
        while (!allZ) {
            int start = 0;
            int end = 0;
            boolean isNum = false;
            while (start < n) {
                min = 101;
                boolean isNum2 = false;
                for (int i = start; i < n; i++) {
                    end = i;
                    if (h[i] > 0) {
                        isNum = true;
                        isNum2 = true;
                    }
                    if (h[i] == 0 && isNum2) {
                        break;
                    }
                    end = i + 1;
                }
                if (!isNum) {
                    allZ = true;
                    break;
                }
                for (int i = start; i < end; i++) {
                    if (h[i] == 0) {
                        continue;
                    }
                    min = Math.min(min, h[i]);
                }
                if (min != 101) {
                    ans += min;
                }
                for (int i = start; i < end; i++) {
                    if (h[i] == 0) {
                        continue;
                    }
                    h[i] -= min;
                }
                start = end + 1;
            }
        }
        System.out.println(ans);
    }
}