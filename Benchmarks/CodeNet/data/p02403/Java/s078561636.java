import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (;;) {
            int h = scanner.nextInt(), w = scanner.nextInt();

            if (h == 0 && w == 0) {
                return;
            }

            for (int j = 0; j < h; ++j) {
                StringBuilder builder = new StringBuilder();
                for (int k = 0; k < w; ++k) {
                    builder.append("#");
                }
                System.out.println(builder.toString());
            }
            System.out.println();

        }
    }
}
