import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = -1;
        }

        int s, c;
        boolean flag = true;
        for (int i = 0; i < m; i++) {
            s = sc.nextInt() - 1;
            c = sc.nextInt();
            if (num[s] == -1) {
                num[s] = c;
            } else if (num[s] != c) {
                flag = false;
                break;
            }
        }

        if (num[0] == 0 && n > 1) {
            flag = false;
        }

        if (!flag) {
            System.out.println(-1);
            return;
        }

        if (num[0] == -1 && n > 1) {
            num[0] = 1;
        }

        for (int i = 0; i < n; i++) {
            if (num[i] == -1) {
                num[i] = 0;
            }
            System.out.print(num[i]);
        }

    }
}