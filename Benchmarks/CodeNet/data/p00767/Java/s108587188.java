import java.util.Scanner;

public class Main {
    static Scanner sc;

    final static int INF = Integer.MAX_VALUE;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        while(true) {
            int w = sn();
            int h = sn();
            if ((w | h) == 0) {
                break;
            }
            int rr = rr(w, h);
            int min = INF;
            int minh = 0, minw = 0;
            for (int i = 1; i <= 150; i++) {
                for (int j = i + 1; j <= 150; j++) {
                    int rr2 = rr(i, j);
                    if (rr >= rr2) {
                        continue;
                    }
                    if (min > rr2) {
                        min = rr2;
                        minh = i;
                        minw = j;
                    }
                }
            }
            System.out.println(minh + " " + minw);
        }
    }

    public static int rr(int w, int h) {
        return w * w + h * h;
    }

    public static int sn() {
        return sc.nextInt();
    }
}