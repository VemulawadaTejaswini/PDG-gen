import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        if (k > (n - 1) * (n - 2) / 2) {
            System.out.println(-1);
            return;
        }
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int i = 2; i <= n; i++) {
            sb.append(1).append(" ").append(i).append("\n");
            count++;
        }
        int total = (n - 1) * (n - 2) / 2;
        for (int i = 2; i <= n && total > k; i++) {
            for (int j = i + 1; j <= n && total > k; j++) {
                sb.append(i).append(" ").append(j).append("\n");
                count++;
                total--;
            }
        }
        System.out.println(count);
        System.out.print(sb);
    }
}