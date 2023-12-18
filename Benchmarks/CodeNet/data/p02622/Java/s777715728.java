import java.util.Scanner;

public class Main {

    public Main() {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        String T = scanner.next();

        int R = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) != T.charAt(i))
                R++;
        }

        System.out.println(R);
    }

    public static void main(String[] args) {
        new Main();
    }
}
