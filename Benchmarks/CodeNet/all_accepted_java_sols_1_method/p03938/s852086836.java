import java.util.*;

public class Main {
    static final int MOD = 1000000007;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] aArr = new int[n];
        int[] bArr = new int[n];
        for (int i = 0; i < n; i++) {
            int p = sc.nextInt() - 1;
            aArr[p] = i + 1;
            bArr[p] = i + 1;
        }
        for (int i = n - 2; i >= 0; i--) {
            bArr[i] += bArr[i + 1] + 1;
        }
        StringBuilder sbA = new StringBuilder();
        StringBuilder sbB = new StringBuilder();
        sbA.append(aArr[0]);
        sbB.append(bArr[0]);
        for (int i = 1; i < n; i++) {
            aArr[i] += aArr[i - 1] + 1;
            sbA.append(" ").append(aArr[i]);
            sbB.append(" ").append(bArr[i]);
        }
       System.out.println(sbA);
       System.out.println(sbB);
    }
}
