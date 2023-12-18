import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] arr = sc.next().toCharArray();
        int[] leftJ = new int[n + 2];
        int[] rightI = new int[n + 2];
        for (int i = 1; i <= n; i++) {
            leftJ[i] = leftJ[i - 1];
            if (arr[i - 1] == 'J') {
                leftJ[i]++;
            }
            rightI[n - i + 1] = rightI[n - i + 2];
            if (arr[n - i] == 'I') {
                rightI[n - i + 1]++;
            }
        }
        long sumI = 0;
        long sumJ = 0;
        long maxO = 0;
        long total = 0;
        for (int i = 1; i <= n; i++) {
            long tmp;
            if (arr[i - 1] == 'O') {
                tmp = leftJ[i - 1] * rightI[i + 1];
                total += tmp;
                sumJ += (leftJ[i - 1] + 1) * rightI[i + 1];
                sumI += leftJ[i - 1] * (rightI[i + 1] + 1);
            } else {
                tmp = leftJ[i - 1] * rightI[i];
            }
            maxO = Math.max(maxO, tmp);
        }
        total += maxO;
        total = Math.max(total, sumJ);
        total = Math.max(total, sumI);
        System.out.println(total);
    }
}

