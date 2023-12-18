import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            String S = in.next();
            int min = (int) 1e9;
            for (int i = 3; i <= S.length(); i++) {
                String sub = S.substring(i - 3, i);
                min = Math.min(min, Math.abs(753 - Integer.parseInt(sub)));
            }
            System.out.println(min);
        }
    }
}
