import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        // int n = 200000;
        // int k = 200000;
        
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        
        // int[] array = new int[n];
        // array[0] = 1;
        
        int de = 0;
        while (k-- > 0) {
            int[] start = new int[n];
            int[] end = new int[n];
            for(int i = 0; i < n; i++) {
                start[i] = Math.max(0, i-array[i]);
                end[i] = Math.min(n-1, i+array[i]);
            }
            
            // imos法: 累積和の区間版
            // sum[i]: 時刻iで放送中の番組数
            int[] sum = new int[n+1];
            for (int i = 0; i < n; i++) {
                // 時刻start[i]で放送番組が1増える
                // 時刻end[i]+1で放送番組が1減る
                sum[start[i]]++;
                sum[end[i] + 1]--;
            }
            for (int i = 0; i < n; i++) {
                sum[i + 1] += sum[i];
            }
            
            long tmp = 0;
            for (int i = 0; i < n; i++) {
                array[i] = sum[i];
                tmp += array[i];
            }
            
            long aa = (long)n;
            
            if (tmp == aa * n) {
                for (int i = 0; i < n; i++) {
                    System.out.print(array[i]);
                    if (i != n - 1) {
                        System.out.print(" ");
                    } else {
                        System.out.println();
                    }
                }
                // System.out.println(k);
                return;
            }
            
            // System.out.println(Arrays.toString(sum));
        }
        
        for (int i = 0; i < n; i++) {
            System.out.print(array[i]);
            if (i != n - 1) {
                System.out.print(" ");
            } else {
                System.out.println();
            }
        }
    }
}
