
import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        boolean isFumiyasui = true;

        for (int i = 0; i < S.length(); i += 2) {
            if (S.charAt(i) == 'L') {
                System.out.println("No");
                return;
            }
        }

        for (int i = 1; i < S.length(); i += 2) {
            if (S.charAt(i) == 'R') {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }
}


