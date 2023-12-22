import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = in.nextInt();
        }
        long[] sums = new long[n+1];
        for(int i=0; i<=n; i++) {
            sums[i] = 0;
        }
        for(int i=0; i<n; i++) {
            sums[a[i]]++;
        }
        
        long total = 0;
        for(int i=1; i<=n; i++) {
            total += sums[i] * (sums[i]-1) / 2;
        }
        
        for(int i=0; i<n; i++) {
            long ans = total - (sums[a[i]] * (sums[a[i]]-1) / 2) + ((sums[a[i]]-1) * (sums[a[i]]-2) / 2);
            System.out.println(ans);
        }
    }
}
