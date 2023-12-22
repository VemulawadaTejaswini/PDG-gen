import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            String[] s = new String[h];
            for (int i = 0; i < h; i++) {
                s[i] = sc.next();
            }

            boolean ok = true;
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (s[i].charAt(j) == '#') {
                        if ((i == 0 || s[i - 1].charAt(j) != '#') && (i == h - 1 || s[i + 1].charAt(j) != '#')
                                && (j == 0 || s[i].charAt(j - 1) != '#') && (j == w - 1 || s[i].charAt(j + 1) != '#')) {
                            ok = false;
                            break;
                        }
                    }
                }
                if (!ok) {
                    break;
                }
            }

            if (ok) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

}
