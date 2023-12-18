import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextLong();
        }
        long max = a[1] - a[0];
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                max = Math.max(max, a[j]-a[i]);
            }
        }
        System.out.println(max);
    }
}

