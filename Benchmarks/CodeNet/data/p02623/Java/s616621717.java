import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        long[] aList = new long[n + 1];
        long[] bList = new long[m + 1];
        for (int i = 1; i <= n; i++) {
            aList[i] = aList[i - 1] + sc.nextInt();
        }
        for (int i = 1; i <= m; i++) {
            bList[i] = bList[i - 1] + sc.nextInt();
        }
        sc.close();

        int max = 0;
        for (int i = 0, j = m; i <= n; i++) {
            while (j >= 0 && k < aList[i] + bList[j]) {
                j--;
            }
            if (j < 0) {
                break;
            }
            max = Math.max(max, i + j);
        }
        System.out.println(max);
    }
}
