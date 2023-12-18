import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        Arrays.setAll(a, i -> sc.nextLong());
        sc.close();
        Arrays.sort(a);
        long res = a[0];
        long max = (long)Math.pow(10,18);
        for (int i = 1; i < n; i++) {
            if (res * a[i] > max) {
                res = -1;
                break;
            } else {
                res *= a[i];
            }
        }
        
        System.out.println(res);    
    }
}