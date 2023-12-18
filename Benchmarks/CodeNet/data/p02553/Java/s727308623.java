import java.util.*;
public class Main {

    public static void main(String[] args){
        Main main = new Main();
        main.input();
        main.solve();
        main.output();
    }

    long a;
    long b;
    long c;
    long d;
    long result;

    private void input() {
        Scanner sc = new Scanner(System.in);
        a = sc.nextLong();
        b = sc.nextLong();
        c = sc.nextLong();
        d = sc.nextLong();
    }

    private void solve() {
        long ac = a*c;
        long ad = a*d;
        long bc = b*c;
        long bd = b*d;
        result = max(max(ac,ad), max(bc,bd));
    }

    private long max(long l1, long l2) {
        if (l1 > l2) {
            return l1;
        } else {
            return l2;
        }
    }

    private void output() {
        System.out.println(result);
        /*
        System.out.println((n==0) ? "Yes" : "No");
        */
    }
}
