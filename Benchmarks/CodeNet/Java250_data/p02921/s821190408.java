import java.util.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Solver {

    public void run() {
        Scanner sc = new Scanner(System.in);
        char[] S = sc.next().toCharArray();
        char[] T = sc.next().toCharArray();

        int cnt = 0;
        for (int i = 0; i < 3; i++) {
            char ch = S[i];
            if (ch == T[i]) {
                cnt++;
            }
        }

        System.out.println(cnt);
        return;
    }

}