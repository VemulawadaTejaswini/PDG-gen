import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n+1];
        int[] b = new int[n];
        for(int i = 0; i < n+1; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            b[i] = sc.nextInt();
        }
        long ans = 0;
        for(int i = 0; i < n; i++){
            if(a[i] <= b[i]){
                ans += a[i];
                b[i] -= a[i];
                a[i] = 0;
                ans += Math.min(a[i+1], b[i]);
                a[i+1] = Math.max(0,a[i+1]-b[i]);
            }else{
                ans += b[i];
            }
        }
        System.out.println(ans);
    }
}