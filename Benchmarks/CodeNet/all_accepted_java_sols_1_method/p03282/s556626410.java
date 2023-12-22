import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            String S = in.next();
            long K = in.nextLong();

            int index = 1;
            for (int i = 0; i < S.length(); i++) {
                char n = S.charAt(i);
                if (n == '1') {
                    if (K >= index && K < index + 1) {
                        System.out.println(n);
                        return;
                    } else {
                        index++;
                    }
                } else {
                    System.out.println(n);
                    return;
                }
            }
        }
    }

}
