import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int count = 0;
        int k1 = 0;
        int k2 = 0;
        PrintWriter out = new PrintWriter(System.out);
        for (int l = 1; l <= N; l++) {
            for (int i = 1; i <= Math.sqrt(N / 2); i++) {
                for (int j = 1; j <= Math.sqrt(N / 2); j++) {
                    k1 = (-i - j + (int) Math.sqrt((i + j) * (i + j) - 4 * (i * i + j * j + i * j - l))) / 2;
                    k2 = (-i - j - (int) Math.sqrt((i + j) * (i + j) - 4 * (i * i + j * j + i * j - l))) / 2;
                    if (k1 > 0 && i * i + j * j + k1 * k1 + i * j + j * k1 + k1 * i == l) {
                        count++;
                    }

                    if (k2 > 0 && i * i + j * j + k2 * k2 + i * j + j * k2 + k2 * i == l) {
                        count++;
                    }
                }
            }
            out.println(count);
            out.flush();
            count = 0;
        }
        sc.close();
    }
}