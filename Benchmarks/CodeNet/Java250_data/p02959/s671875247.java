import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n+1];
        int[] b = new int[n];

        for(int i = 0; i <= n; i++)
        	a[i] = sc.nextInt();
        for(int i = 0; i < n; i++)
        	b[i] = sc.nextInt();
        
        long cnt = 0;
        for(int i = 0; i < n; i++) {
        	int cnt1 = Math.min(a[i], b[i]);
        	cnt += cnt1;
        	a[i] -= cnt1;
        	b[i] -= cnt1;
        	if(b[i] > 0) {
        		cnt1 = Math.min(b[i], a[i+1]);
        		cnt += cnt1;
        		a[i+1] -= cnt1;
        	}
        }
        System.out.println(cnt);
    }
}
