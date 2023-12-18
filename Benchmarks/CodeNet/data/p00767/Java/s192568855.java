import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            if ((h | w) == 0) {
                break;
            }
            int m = h * h + w * w;
            int ah = 0;
            int aw = 0;
            int mMin = Integer.MAX_VALUE;

            for (int i = 1; i <= 150; i++) {
                int i2 = i * i;
                for (int j = i; j <= 150; j++) {
                    int mk = i2 + j * j;
                    if (mk <= m) {
                        continue;
                    }
                    if (mMin > mk) {
                        mMin = mk;
                        ah = i;
                        aw = j;
                    }
                }
            }
            System.out.println(ah + " " + aw);
        }
    }
}