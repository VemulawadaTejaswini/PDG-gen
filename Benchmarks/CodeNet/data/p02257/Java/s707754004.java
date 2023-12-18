import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int[] FURUI = new int[100_000_000 + 1];
            for (int i = 2; i < FURUI.length; i++) {
                FURUI[i] = 1;
            }
            for (int i = 2; i * i <= FURUI.length; i++) {
                if (FURUI[i] == 0) {
                    continue;
                }
                for (int j = i + i; j < FURUI.length; j += i) {
                    FURUI[j] = 0;
                }
            }
            int count = 0;
            while (N-- > 0) {
                count += FURUI[in.nextInt()];
            }
            System.out.println(count);
        }
    }
}