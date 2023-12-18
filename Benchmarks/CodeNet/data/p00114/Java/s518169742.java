import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int[] l = new int[6];
            for (int i = 0, s; i < 6; l[i++] = sc.nextInt())
                ;
            if (l[0] == 0) {
                break;
            }
            int[] count = new int[3];
            for (int i = 0; i < 3; i++) {
                int q = 1;
                do {
                    q = l[i * 2] * q % l[i * 2 + 1];
                    count[i]++;
                } while (q != 1);
            }
            long t = count[0] * count[1] / g(count[0], count[1]);
            System.out.println(t * count[2] / g(t, count[2]));
        }
    }

    static long g(long x, long y) {
        return y == 0 ? x : g(y, x % y);
    }
}


