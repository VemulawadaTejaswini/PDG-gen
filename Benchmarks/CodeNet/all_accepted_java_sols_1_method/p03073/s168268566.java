import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            String S = in.next();
            char[] cs = S.toCharArray();
            int count01 = 0;
            int count10 = 0;
            for (int i = 0; i < cs.length; i++) {
                char c = cs[i];
                if (i % 2 == 0) {
                    if (c == '0') {
                        count10++;
                    } else {
                        count01++;
                    }
                } else {
                    if (c == '0') {
                        count01++;
                    } else {
                        count10++;
                    }
                }
            }
            System.out.println(Math.min(count01, count10));
        }
    }
}
