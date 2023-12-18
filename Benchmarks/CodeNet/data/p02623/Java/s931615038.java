import java.util.Scanner;

public class  Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        long[] sumA = new long[n+1];
        long[] sumB = new long[m+1];
        for (int i = 0; i < n; i++) {
            sumA[i+1] = sumA[i] + sc.nextLong();
        }
        for (int i = 0; i < m; i++) {
            sumB[i+1] = sumB[i] + sc.nextLong();
        }
        sc.close();

        int tmpA = n;
        while (sumA[tmpA] > k) {
            tmpA--;
        }
        int tmpB = m;
        while (sumB[tmpB] > k) {
            tmpB--;
        }

        int indexB = 0;
        int max = 0;
        while (tmpA >= 0 && indexB <= tmpB) {
            long cur = sumA[tmpA] + sumB[indexB];
            while (cur < k && indexB < tmpB) {
                cur = sumA[tmpA] + sumB[++indexB];
            }
            int index = tmpA + indexB-1;
            if (cur == k) {
                index++;
            }
            max = Math.max(index, max);
            tmpA--;

        }

        System.out.println(max);
    }
}