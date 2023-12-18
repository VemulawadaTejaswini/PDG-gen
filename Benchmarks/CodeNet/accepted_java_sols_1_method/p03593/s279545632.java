import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        char[][] a = new char[h][w];
        int[] alpha = new int[26];
        for (int i = 0; i < h; i++) {
            a[i] = sc.next().toCharArray();
            for (int j = 0; j < w; j++) {
                alpha[a[i][j] - 'a']++;
            }
        }
        int g2 = (h / 2) * (w % 2) + (h % 2) * (w / 2);
        int g4 = (h / 2) * (w / 2);
        for (int i = 0; i < alpha.length; i++) {
            g4 -= alpha[i] / 4;
            alpha[i] %= 4;
            g2 -= alpha[i] / 2;
            alpha[i] %= 2;
        }
        if (g4 > 0 || (g2 + 2 * g4) > 0) {
            System.out.println("No");
            return;
        }
        System.out.println("Yes");
    }

}
