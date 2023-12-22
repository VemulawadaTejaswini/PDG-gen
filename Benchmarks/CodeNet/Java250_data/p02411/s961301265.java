import java.util.Scanner;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    Scanner sc = new Scanner(System.in);

    void solve() {
        String str;
        while (true) {
            str = sc.nextLine();
            String[] sp = str.split(" ");
            int m = Integer.parseInt(sp[0]);
            int f = Integer.parseInt(sp[1]);
            int r = Integer.parseInt(sp[2]);
            if(isFin(m,f,r))break;
            System.out.println(judge(m, f, r));
        }
    }

    boolean isFin(int m, int f, int r) {
        return m == -1 && f == -1 && r == -1;
    }

    String judge(int m, int f, int r) {
        int sum = m + f;
        if (m == -1 || f == -1 || sum < 30) return "F";
        if (sum < 50) return r >= 50 ? "C" : "D";
        if (sum < 65) return "C";
        if (sum < 80) return "B";
        return "A";
    }
}
