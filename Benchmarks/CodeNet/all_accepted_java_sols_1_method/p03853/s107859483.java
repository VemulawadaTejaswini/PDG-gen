import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int H = in.nextInt();
            int W = in.nextInt();
            String[] C = new String[H];
            for (int h = 0; h < H; h++) {
                C[h] = in.next();
            }

            for (int h = 0; h < H; h++) {
                for (int w = 0; w < W; w++) {
                    char c = C[h].charAt(w);
                    System.out.print(c);
                }
                System.out.println();
                for (int w = 0; w < W; w++) {
                    char c = C[h].charAt(w);
                    System.out.print(c);
                }
                System.out.println();
            }
        }
    }
}
