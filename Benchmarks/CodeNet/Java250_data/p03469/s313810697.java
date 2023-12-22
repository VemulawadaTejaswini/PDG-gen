import java.util.*;


public class Main {
    static void solve() {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        s = "2018" + s.substring(4, s.length());
        System.out.println(s);
    }

    public static void main(String[] args) {
        solve();
    }
}
