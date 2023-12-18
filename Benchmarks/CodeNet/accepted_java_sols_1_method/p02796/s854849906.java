import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][2];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int l = sc.nextInt();
            a[i][0] = x-l;
            a[i][1] = x+l;
        }
        Arrays.sort(a,(x, y) -> x[0] - y[0]);
        int ans = 0;
        int l = a[0][0];
        int r = a[0][1];
        for (int i = 1; i < n; i++) {
            if(r <= a[i][0]){
                l = a[i][0];
                r = a[i][1];
            }else{
                ans++;
                if(a[i][1] < r){
                    l = a[i][0];
                    r = a[i][1];
                }
            }
        }
        System.out.println(n - ans);
        sc.close();

    }

}
