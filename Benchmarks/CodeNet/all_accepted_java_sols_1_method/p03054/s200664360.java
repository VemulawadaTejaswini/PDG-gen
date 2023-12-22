import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h = in.nextInt();
        int w = in.nextInt();
        int n = in.nextInt();
        int sr = in.nextInt();
        int sc = in.nextInt();
        char[] s = in.next().toCharArray();
        char[] t = in.next().toCharArray();
        int l = 0, r = 0, u = 0, d = 0;
        int L = sc, R = w - sc +1, U = sr, D = h - sr +1;
        boolean ans = false;
        for (int i = 0; i < n; i++) {
            if(s[i] == 'L') l++;
            if(s[i] == 'R') r++;
            if(s[i] == 'U') u++;
            if(s[i] == 'D') d++;
            if(L <= l || R <= r || U <= u || D <= d){
                ans = true;
                break;
            }
            if(t[i] == 'L' && (0 < r || Math.abs(r) < L-1)) r--;
            if(t[i] == 'R' && (0 < l || Math.abs(l) < R-1)) l--;
            if(t[i] == 'U' && (0 < d || Math.abs(d) < U-1)) d--;
            if(t[i] == 'D' && (0 < u || Math.abs(u) < D-1)) u--;
        }
        System.out.println(ans ? "NO" : "YES");
        in.close();
    }

}
