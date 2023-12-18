import java.util.*;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) throws java.io.IOException {
        // TODO 自動生成されたメソッド・スタブ
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n == 0)
                break;
            int p[] = new int[n];
            for (int i = 0; i < n; i++)
                p[i] = sc.nextInt();
            StringBuilder sb = new StringBuilder();
            int start = p[0];
            int end = start;
            for (int i = 0; i < n; i++) {
                if (i == n - 1) {
                    sb.append(start);
                    if (end != start) {
                        sb.append("-" + end);
                    }
                } else if (p[i + 1] - p[i] == 1) {
                    end++;
                } else {
                    sb.append(start);
                    if (end != start) {
                        sb.append("-" + end);
                    }
                    sb.append(" ");
                    start = p[i + 1];
                    end = start;
                }
            }
            System.out.println(sb.toString());
        }

    }
}