import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] a = sc.next().toCharArray();
        int[] r = new int[n];
        int[] g = new int[n];
        int[] b = new int[n];
        if(a[0] == 'R') r[0]++;
        if(a[0] == 'G') g[0]++;
        if(a[0] == 'B') b[0]++;
        for (int i = 1; i < n; i++) {
            r[i] = r[i-1];
            g[i] = g[i-1];
            b[i] = b[i-1];
            if(a[i] == 'R') r[i]++;
            if(a[i] == 'G') g[i]++;
            if(a[i] == 'B') b[i]++;
        }
        long ans = 0L;
        for (int i = 0; i < n-2; i++) {
            for (int j = i+1; j < n-1; j++) {
                if(a[i] == a[j]) continue;
                int d = j-i;
                int ng = j+d;
                int x = 0;
                if(a[i] != 'R' && a[j] != 'R') {
                    x = r[n-1]-r[j];
                    if(ng <= n-1 &&  a[ng] == 'R') x--;
                }else if(a[i] != 'G' && a[j] != 'G'){
                    x = g[n-1]-g[j];
                    if(ng <= n-1 &&  a[ng] == 'G') x--;
                }else if(a[i] != 'B' && a[j] != 'B'){
                    x = b[n-1]-b[j];
                    if(ng <= n-1 &&  a[ng] == 'B') x--;
                }
                ans += x;
            }
        }
        System.out.println(ans);
        sc.close();

    }

}
