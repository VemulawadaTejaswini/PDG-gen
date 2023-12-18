import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] S = sc.next().toCharArray();
        String T = sc.next();

        for (int i = 0; i < S.length; i++) {
            char tmp = S[0];
            for (int j = 0; j < S.length - 1; j++) {
                S[j] = S[j + 1];
            }
            S[S.length - 1] = tmp;
            if (String.valueOf(S).equals(T)) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");

    }
}
