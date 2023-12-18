import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt(), w = sc.nextInt(), r = (1 << sc.nextInt()) - 1, count = 0, x[] = new int[h], y[] = new int[w];
        for (int i = 0; i < h; i++) {
            char[] c = sc.next().toCharArray();
            for (int j = 0; j < w; j++) {
                int t = c[j] == '.' ? 1 : 0;
                x[i] = (x[i] + t) << (w - 1 > j ? 1 : 0);
                y[j] = (y[j] + t) << (h - 1 > i ? 1 : 0);
            }
        }
        for (int i : x) {
            while (r <= i) {
                if ((i & r) == r) {
                    count++;
                }
                i >>= 1;
            }
        }
        for (int i : y) {
            while (r <= i) {
                if ((i & r) == r) {
                    count++;
                }
                i >>= 1;
            }
        }
        System.out.println(count);
    }
}
