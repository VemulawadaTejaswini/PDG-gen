import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        int k = 0;
        int count = 1;
        for(int i = 1; i <=n; i++) {
            if(a[i-1] == count) {
                k++;
                count++;
            }
        }
        int ans = n-k;
        if(ans == n) ans = -1; 
        System.out.println(ans);
    }
}