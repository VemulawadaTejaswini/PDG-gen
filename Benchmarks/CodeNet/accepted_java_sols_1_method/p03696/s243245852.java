import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        String S = sc.next();
        int cnt_l=0;
        int cnt_r=0;
        int l=0;
        for (int i=0;i<N;i++) {
            if (S.charAt(i)=='(') {
                cnt_l++;
            } else {
                cnt_r++;
            }
            l=Math.max(l, cnt_r-cnt_l);
        }
        cnt_l=0;
        cnt_r=0;
        int r=0;
        for (int i=N-1;i>=0;i--) {
            if (S.charAt(i)=='(') {
                cnt_l++;
            } else {
                cnt_r++;
            }
            r=Math.max(r, cnt_l-cnt_r);
        }
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<l;i++) {
            sb.append('(');
        }
        sb.append(S);
        for (int j=0;j<r;j++) {
            sb.append(')');
        }
        System.out.println(sb);
    }
}