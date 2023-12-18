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

        for (int i = 0; i < S.length; i++) {
            if (S[i] != T[i]) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
        return;
    }

}