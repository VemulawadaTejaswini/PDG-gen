import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        final Scanner scanner = new Scanner(System.in);
        final String s = scanner.nextLine();

        final StringBuilder cand0Builder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            cand0Builder.append(i % 2 == 0 ? '0' : '1');
        }

        final String cand0 = cand0Builder.toString();

        int diffCount0 = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == cand0.charAt(i)) {
                diffCount0++;
            }
        }

        System.out.println(Math.min(diffCount0, cand0.length() - diffCount0));
    }
}
