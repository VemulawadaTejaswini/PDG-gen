import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while (true) {
            int r0 = sc.nextInt();
            int w0 = sc.nextInt();
            int c = sc.nextInt();
            int r = sc.nextInt();
            if (r0 == 0) {
                break;
            }
            sb.append(Math.max((c * w0 - r0 + r - 1) / r, 0)).append("\n");
        }
        System.out.print(sb);
    }
}

