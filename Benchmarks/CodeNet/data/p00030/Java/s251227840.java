import java.util.Scanner;

class Main {
    public static int n;
    public static int s;
    public static int c;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            n = sc.nextInt();
            s = sc.nextInt();
            if (n == 0 && s == 0) {
                break;
            }
            c = 0;
            //dfs(0, s, s);
            dfs2(n, s, 0);
            System.out.println(c);

        }
    }

    static void dfs(int k, int rest, int x) {
        if (k == n && rest == 0) {
            c++;
        }
        if (rest >= 0) {
            for (int i = Math.min(x, 9); i >= 0; i--) {
                dfs(k + 1, rest - i, i - 1);
            }
        }
    }

    static void dfs2(int k, int rest, int x) {
        if (k == 0 && rest == 0) {
            c++;
        }
        if (rest >= 0) {
            for (int i = x; i <= 9; i++) {
                dfs2(k - 1, rest - i, i + 1);
            }
        }
    }
}
