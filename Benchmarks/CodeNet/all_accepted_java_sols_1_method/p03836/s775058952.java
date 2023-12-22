import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int sx = in.nextInt();
            int sy = in.nextInt();
            int tx = in.nextInt();
            int ty = in.nextInt();

            StringBuilder sb = new StringBuilder();
            for (int x = sx; x < tx; x++) {
                sb.append("R");
            }
            for (int y = sy; y < ty; y++) {
                sb.append("U");
            }
            for (int x = tx; x > sx; x--) {
                sb.append("L");
            }
            for (int y = ty; y > sy; y--) {
                sb.append("D");
            }

            sb.append("D");
            for (int x = sx; x < tx + 1; x++) {
                sb.append("R");
            }
            for (int y = sy - 1; y < ty; y++) {
                sb.append("U");
            }
            sb.append("L");
            sb.append("U");
            for (int x = tx; x > sx - 1; x--) {
                sb.append("L");
            }
            for (int y = ty + 1; y > sy; y--) {
                sb.append("D");
            }
            sb.append("R");
            System.out.println(sb.toString());
        }
    }
}
