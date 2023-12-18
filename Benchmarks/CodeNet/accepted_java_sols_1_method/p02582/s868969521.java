import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String S = sc.next();
            int max = 0;
            int count = 0;
            for (int i = 0; i < S.length(); i++) {
                if (S.charAt(i) == 'R') {
                    count++;
                } else {
                    max = Math.max(max, count);
                    count = 0;
                }
            }
            max = Math.max(max, count);
            System.out.println(max);
        }
    }
}
