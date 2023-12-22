import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        long[] a = new long[n + 1];
        long[] b = new long[m + 1];

        for(int i = 1; i < n + 1; i++){
            a[i] = a[i - 1] + sc.nextInt();
        }

        for(int i = 1; i < m + 1; i++){
            b[i] = b[i - 1] + sc.nextInt();
        }

        int t = m;
        int ans = 0;
        for(int i = 0; i < n + 1; i++){
            for(int j = t; j >= 0; j--){
                if(a[i] + b[j] <= k){
                    ans = Math.max(ans, i + j);
                    t = j;
                    break;
                }
            }
        }

        System.out.println(ans);
    }
}
