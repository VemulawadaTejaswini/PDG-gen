import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int R = in.nextInt();
            int G = in.nextInt();
            int B = in.nextInt();
            int N = in.nextInt();
            int count = 0;
            for (int r = 0;; r++) {
                if (r * R > N) {
                    break;
                }
                for (int g = 0;; g++) {
                    if (r * R + g * G > N) {
                        break;
                    }

                    if ((N - (r * R + g * G)) % B == 0) {
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
