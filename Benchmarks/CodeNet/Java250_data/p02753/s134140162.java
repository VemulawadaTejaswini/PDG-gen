import java.util.Scanner;

class Solver {
    public void Solve() {
        String s = sc.next();
        if (s.charAt(0) == s.charAt(1) && s.charAt(1) == s.charAt(2)) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
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
