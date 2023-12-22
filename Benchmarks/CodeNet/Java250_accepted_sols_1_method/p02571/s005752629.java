import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);

        String S = scanner.next();
        String T = scanner.next();

        // 素直にやっても最悪1000 * 1000なので行ける気がする
        int minReplace = Integer.MAX_VALUE;

        for (int seek = 0; seek + T.length() <= S.length(); seek++) {
            int replace = 0;
            for (int i = 0; i < T.length(); i++) {
                if (T.charAt(i) != S.charAt(seek + i)) {
                    replace++;
                }
            }

            if (minReplace > replace) {
                minReplace = replace;
            }
        }

        System.out.println(minReplace);
    }
}