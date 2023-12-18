import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int N = S.length();
        for (int i = 0; i < N/2; i++) {
            if (S.charAt(i) != S.charAt(N-1-i)) {
                System.out.println("No");
                return;
            }
        }
        for (int i = 0; i < N/2; i++) {
            if (S.charAt(i) != S.charAt(N/2-1-i)) {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }
}

