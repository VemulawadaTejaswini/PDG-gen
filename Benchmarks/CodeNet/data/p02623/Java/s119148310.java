import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long k = sc.nextLong();
        long[] a = new long[n];
        long[] b = new long[m];
        Arrays.setAll(a, i -> sc.nextLong());
        Arrays.setAll(b, i -> sc.nextLong());
        sc.close();
        int i = 0;
        int j = 0;
        long sum = 0;
        int cnt = 0;
        while(i < n && j < m) {
            if (a[i] <= b[j]) {
                if (sum + a[i] <= k) {
                    sum += a[i];
                    cnt++;
                    i++;
                }
                else break;
            } else {
                if (sum + b[j] <= k) {
                    sum += b[j];
                    cnt++;
                    j++;
                }
                else break;
            }
        }
        if (i < n) {
            while(i < n) {
                if (sum + a[i] <= k) {
                    sum += a[i];
                    cnt++;
                    i++;
                }
                else break;
            }
        }
        if (j < m) {
            while(j < m) {
                if (sum + b[j] <= k) {
                    sum += b[j];
                    cnt++;
                    j++;
                }
                else break;
            }
        }
        
        System.out.println(cnt);
    }
}

