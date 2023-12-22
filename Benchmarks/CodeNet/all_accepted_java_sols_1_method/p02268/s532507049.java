import java.util.*;

public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] s = new int[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.nextInt();
        }
        int q = sc.nextInt();
        int[] t = new int[q];
        for (int i = 0; i < q; i++) {
            t[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < q; i++) {
            int l = 0;
            int r = n;
            while(1 < r-l){
                int mid = (r + l) / 2;
                if(t[i] < s[mid]) r = mid;
                else l = mid;
            }
            if(s[l] == t[i]) ans++;
        }
        System.out.println(ans);
        sc.close();

    }

}

