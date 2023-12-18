import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k=sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) arr[i] = sc.nextInt();
        int ans = 0;
        n = n - k;
        while (n > 0) {
            n -= (k-1);
            ans++;
        }
        System.out.println(ans+1);
    }
}