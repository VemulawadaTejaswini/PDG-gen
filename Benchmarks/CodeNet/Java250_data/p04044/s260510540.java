
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {

    int n;
    int l;
    String[] s;

    Main(int n, int l, String[] s) {
        this.n = n;
        this.l = l;
        this.s = s;
    }

    String solve() {

        String ans = "";

        List<String> sList = new ArrayList<>(Arrays.asList(s));
        Collections.sort(sList);

        for (String si : sList) {
            ans += si;
        }

        return ans;
    }

    public static void main(String args[]) {
        // input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();

        // solve
        String ans = new Main(n, l, s).solve();

        // display
        System.out.println(ans);
    }
}