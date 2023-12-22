import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        while (in.hasNext()) {
            int n = in.nextInt();
            int x = in.nextInt();

            if (n == 0) {
                break;
            }

            int ret = 0;
            for (int i = n; i >= 3; i--) {
                ret += cntPattern(i - 1, x - i);
            }
            sb.append(ret).append("\n");
        }

        System.out.print(sb.toString());
    }

    private static int cntPattern(int n, int x) {
        int ret = 0;
        int max = 2 * n;
        if (max <= x) {
            return 0;
        }
        if (max - 1 == n) {
            return 1;
        }

        for (int i = n; i > 1; i--) {
            for (int j = i - 1; j >= 1; j--) {
                if (j + i == x) {
                    ret++;
                    break;
                }
            }
        }
        return ret;
    }
}