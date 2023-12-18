import java.util.Scanner;

public class Main {
    static int bfs(int n, int cnt, int next, int s) {
        if (cnt == n && s == 0) return 1;
        else if (cnt == n || s < 0) return 0;

        int count = 0;
        for (int i = next; i <= 9; ++i) {
            count += bfs(n, cnt + 1, i + 1,s - i);
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int n = scanner.nextInt(), s = scanner.nextInt();
            if (n == 0 && s == 0) break;

            System.out.println(bfs(n, 0, 0, s));
        }
    }
}
