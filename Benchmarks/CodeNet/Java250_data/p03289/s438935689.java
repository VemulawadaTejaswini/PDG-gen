import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            String S = in.next();
            boolean ac = true;
            if (S.charAt(0) == 'A') {
            } else {
                ac = false;
            }
            int count = 0;
            int index = -1;
            for (int i = 2; i <= S.length() - 2; i++) {
                if (S.charAt(i) == 'C') {
                    count++;
                    index = i;
                }
            }
            if (count == 1) {
            } else {
                ac = false;
            }
            for (int i = 1; i < S.length(); i++) {
                if (i == index) {
                    continue;
                }
                if (S.charAt(i) >= 'a' && S.charAt(i) <= 'z') {
                } else {
                    ac = false;
                }
            }
            System.out.println(ac ? "AC" : "WA");
        }
    }
}
