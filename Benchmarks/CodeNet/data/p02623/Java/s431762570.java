import java.math.BigDecimal;
import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        long[] a = new long[n];
        long[] b = new long[m];

        for (int i=0; i<n; i++) a[i] = sc.nextLong();
        for (int i=0; i<m; i++) b[i] = sc.nextLong();

        long[] sumA = new long[n+1];
        long[] sumB = new long[m+1];

        for (int i=0; i<n; i++) {
            sumA[i+1] = sumA[i] + a[i];
        }
        for (int i=0; i<m; i++) {
            sumB[i+1] = sumB[i] + b[i];
        }

//        System.out.print(sumA[3]);

        int cnt = 0;


        for (int i=0; i<n+1; i++) {
            int tmpC = 0;
            long rest = k - sumA[i];
            if (rest < 0) continue;
            tmpC += i;

            int idx = upperbound1(sumB, rest);
//            if (i==n-1) System.out.print(idx);
//            if (sumB[idx]==rest) tmpC += idx
            tmpC += (idx - 1);

            cnt = Math.max(cnt, tmpC);

//            System.out.print(tmpC);

        }

        System.out.print(cnt);

    }

    public static int upperbound1(long[] arr, long value){
        int left = 0;
        int right = arr.length;
        while (left<right){
            int mid = (left+right)/2;
            if (arr[mid]<=value){
                left = mid+1;
            }else {
                right = mid;
            }
        }
        return left;
    }}
