import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int[] T = new int[H + 1];
        for (int i = 1; i < H + 1; i++) {
            T[i] = scanner.nextInt();
        }
        for (int i = 1; i < H + 1; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append("node " + String.valueOf(i) + ": key = " + String.valueOf(T[i]) + ", ");
            if (i / 2 > 0) {
                sb.append("parent key = " + String.valueOf(T[i / 2]) + ", ");
            }
            if (i * 2 < H + 1) {
                sb.append("left key = " + String.valueOf(T[i * 2]) + ", ");
            }
            if (i * 2 + 1 < H + 1) {
                sb.append("right key = " + String.valueOf(T[i * 2 + 1]) + ", ");
            }
            System.out.println(sb.toString());
        }
    }
}