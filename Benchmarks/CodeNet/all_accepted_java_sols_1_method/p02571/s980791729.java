import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String S = sc.next();
            String T = sc.next();

            int min = (int) 1e9;
            for (int start = 0; start + T.length() <= S.length(); start++) {
                int count = 0;
                for (int i = 0; i < T.length(); i++) {
                    if (T.charAt(i) != S.charAt(start + i)) {
                        count++;
                    }
                }
                min = Math.min(min, count);
            }
            System.out.println(min);
        }
    }
}
