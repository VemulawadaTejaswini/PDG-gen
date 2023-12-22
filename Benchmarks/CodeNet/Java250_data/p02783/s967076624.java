import java.util.Scanner;

class Solver {

    public void Solve() {
        int h = sc.nextInt();
        int a = sc.nextInt();
        int cnt = 0;
        while (h > 0) {
            h -= a;
            cnt++;
        }
        System.out.println(cnt);
    }

    Scanner sc;

    Solver(Scanner in) {
        this.sc = in;
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solver s = new Solver(sc);
        s.Solve();
        sc.close();
    }
}
