import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] p = new int[m];
        int[] y = new int[m];
        ArrayList<ArrayList<Integer>> pref = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < n + 1; i++) pref.add(new ArrayList<Integer>());
        for (int i = 0; i < m; i++) {
            p[i] = sc.nextInt();
            y[i] = sc.nextInt();
            pref.get(p[i]).add(y[i]);
        }
        for (int i = 1; i <= n; i++) Collections.sort(pref.get(i));
        for (int i = 0; i < m; i++) {
            String s = String.valueOf(p[i]);
            while (s.length() < 6) s = "0" + s;
            System.out.print(s);
            int l = 0, r = pref.get(p[i]).size();
            while (r - l > 1) {
                int c = (l + r) / 2;
                int yc = pref.get(p[i]).get(c);
                if (yc == y[i]) { l = c; break;}
                if (yc > y[i]) r = c;
                else l = c + 1;
            }
            s = String.valueOf(l + 1);
            while (s.length() < 6) s = "0" + s;
            System.out.println(s);
        }
    }
}