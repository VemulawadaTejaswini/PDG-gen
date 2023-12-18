import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int count = 0;
        PrintWriter out = new PrintWriter(System.out);
        for (int l = 1; l <= N; l++) {
            for (int i = 1; i <= Math.sqrt(N / 2); i++) {
                for (int j = 1; j <= Math.sqrt(N / 2); j++) {
                    for (int k = 1; k <= Math.sqrt(N / 2); k++) {
                        if (i * i + j * j + k * k + i * j + j * k + k * i == l) {
                            count++;
                        }
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