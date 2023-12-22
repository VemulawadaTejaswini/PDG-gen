import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        long[] b = new long[n];
        long[] d = new long[n];
        for(int i = 0; i < n; i++){
           a[i] = sc.nextLong();
        }
        for(int i = 0; i < n; i++){
           b[i] = sc.nextLong();
           d[i] = a[i] - b[i];
        }
        Arrays.sort(d);
        long[] matcher = d.clone();
        int r = n-1;
        for(int i = 0; i < n; i++){
            if(d[i] >= 0){
                break;
            }
            while(d[i] < 0){
                if(d[r] <= 0){
                    System.out.println(-1);
                    return;
                }
                if(d[r] + d[i] > 0){
                    d[r] += d[i];
                    d[i] = 0;
                }else{
                    d[i] += d[r];
                    d[r] = 0;
                    r--;
                }
            }
        }
        int ans = 0;
        for(int i = 0; i < n; i++){
            if(d[i] != matcher[i]) ans++;
        }
        System.out.println(ans);
    }
}
