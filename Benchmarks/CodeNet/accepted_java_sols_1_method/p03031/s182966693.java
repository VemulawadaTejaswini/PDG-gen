import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        // abc 128
        // bit全探索で考えます
        long[] swList = new long[m];
        int[] pList = new int[m];

        for (int i = 0; i < m; i++) {
            long sum = 0;
            int k = sc.nextInt();
            for (int j = 0; j < k; j++) {
                sum += (long)Math.pow(2, sc.nextInt() - 1);
            }
            swList[i] = sum;
        }

        for (int i = 0; i < m; i++) {
            pList[i] = sc.nextInt();
        }

        long ans = 0;

        parent : for (long i = 0; i <= Math.pow(2, n) - 1; i++) {
            for (int j = 0; j < m; j++) {
                if (Long.bitCount(i & swList[j]) % 2 != pList[j]) {
                    continue parent;
                }
            }
            ans++;
        }

        System.out.println(ans);
    }
}