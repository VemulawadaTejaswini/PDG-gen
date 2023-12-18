import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt(), h = sc.nextInt(), tw = sc.nextInt(), th = sc.nextInt();
        char[][] l = new char[h][w];
        char[][] t = new char[th][tw];
        for (int i = 0; i < h; i++) {
            l[i] = sc.next().toCharArray();
        }
        for (int i = 0; i < th; i++) {
            t[i] = sc.next().toCharArray();
        }
        int c = 0;
        for (int i = 0; i <= h - th; i++) {
            out: for (int j = 0; j <= w - tw; j++) {
                for (int k = 0; k < th; k++) {
                    for (int g = 0; g < tw; g++) {
                        if (l[i + k][j + g] != '?' && t[k][g] != '?' && l[i + k][j + g] != t[k][g]) {
                            continue out;
                        }
                    }
                }
                c++;
            }
        }
        System.out.println(c);
    }
}

