import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long c = sc.nextLong();
        long[] xArr = new long[n];
        long[] vArr = new long[n];

        for(int i = 0; i < n; i++) {
        	xArr[i] = sc.nextLong();
        	vArr[i] = sc.nextLong();
        }

        long[] left = new long[n+1];
        long[] leftBack = new long[n+1];
        long aSumValue = 0;
        for(int i = 1; i < n+1; i++) {
        	left[i] = Math.max(left[i-1], aSumValue + vArr[i-1] - xArr[i-1]);
        	leftBack[i] = Math.max(leftBack[i-1], aSumValue + vArr[i-1] - xArr[i-1] * 2);
        	aSumValue += vArr[i-1];
        }

        long[] right = new long[n+1];
        long[] rightBack = new long[n+1];
        long bSumValue = 0;
        for(int i = 1; i < n+1; i++) {
        	int idx = n - i;
        	right[i] = Math.max(right[i-1], bSumValue + vArr[idx] - (c - xArr[idx]));
        	rightBack[i] = Math.max(rightBack[i-1], bSumValue + vArr[idx] - (c - xArr[idx]) * 2);
        	bSumValue += vArr[idx];
        }

        long max = 0;
        for(int i = 0; i < n+1; i++) {
        	max = Math.max(max, Math.max(left[i] + rightBack[n-i], right[n-i] + leftBack[i]));
        }
        System.out.println(max);
    }
}
