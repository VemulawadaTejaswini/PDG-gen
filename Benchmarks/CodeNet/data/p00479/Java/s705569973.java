import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int idx = Math.min(Math.min(x - 1, size - x), Math.min(y - 1, size - y));
            idx %= 3;
            sb.append(idx + 1).append("\n");
        }
        System.out.print(sb);
    }
}

