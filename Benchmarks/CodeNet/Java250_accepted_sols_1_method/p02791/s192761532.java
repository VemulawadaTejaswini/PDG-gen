import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n];
        int[] min = new int[n+1];
      	min[0] = Integer.MAX_VALUE;
        for (int i =0;i<n; i++) {
            p[i] = sc.nextInt();
            if (i > 0) min[i] = Math.min(min[i-1], p[i-1]);
        }

        int ans = 1;
        for (int i = 1;i < n; i ++) {
            if (min[i] > p[i]) ans++;
        }

        System.out.println(ans);

    }
}