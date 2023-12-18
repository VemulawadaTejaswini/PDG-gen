import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int l = 0;
        int r = a[0]+1;
        while(1 < r - l ){
            int m = (l + r) /2;
            int tmp = m;
            boolean over = false;
            boolean odd = false;
            for (int i = 0; i < n; i++) {
                if(a[i] < tmp){
                    if(i % 2 != 0) odd = true;
                    over = true;
                    break;
                }
                tmp = a[i] - tmp;
            }
            if((over&&odd) || (!over && m <= tmp)) l = m;
            else r = m;
        }
        int[] ans = new int[n];
        ans[0] = l;
        StringBuilder sb = new StringBuilder();
        sb.append(ans[0] * 2).append(" ");
        for (int i = 1; i < n; i++) {
            ans[i] = a[i-1] - ans[i-1];
            sb.append(ans[i] * 2).append(" ");
        }
        System.out.println(sb.toString());
        sc.close();

    }

}
