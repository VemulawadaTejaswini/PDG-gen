import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n+1];
        for(int i=1; i<=n; i++) {
            a[i] = Integer.parseInt(sc.next());
        }
        int[] b = new int[n+1];
        b[0] = 1;
        int i= 1;
        int ans = -1;
        while(i <= n) {
            b[i] = a[b[i-1]];
            if(b[i] == 2) {
                ans = i;
                break;
            }
            i++;
        }
        
        System.out.println(ans);
    }

}
