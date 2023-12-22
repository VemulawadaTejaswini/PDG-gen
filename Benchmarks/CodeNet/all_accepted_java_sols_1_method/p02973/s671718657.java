import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int pos = 0;
        int ans[] = new int[n];
        Arrays.fill(ans, Integer.MAX_VALUE);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int add = a[i];
            if (min >= add) {
                min = add;
                ans[pos] = add;
                pos++;
                continue;
            }
            // int max = -1;
            // int maxpos = -1;
            for (int j = 0; j < pos; j++) {
                if (ans[j] < add) {
                    // max = ans[j];
                    // maxpos = j;
                    ans[j] = add;
                    if (j == pos - 1) {
                        min = add;
                    }
                    break;
                }
            }
            /*
             * if (min > add) { min = add; } if (maxpos != -1) { ans[maxpos] = add; } else {
             * ans[pos] = add; pos++; }
             */
        }
        System.out.println(pos);
        sc.close();
    }
}
