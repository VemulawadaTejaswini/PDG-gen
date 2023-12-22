import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

class Main {
    public static void main (String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n, count, i, j, k, l;
        StringBuilder sb = new StringBuilder("");

        while (sc.hasNextInt()) {
            n = sc.nextInt();

            count = 0;
            for (i = 0; i < 10; i++) {
                if (i > n) break;

                for (j = 0; j < 10; j++) {
                    if (i + j > n) break;

                    for (k = 0; k < 10; k++) {
                        if (i + j + k > n) break;

                        for (l = 0; l < 10; l++) {
                            if (i + j + k + l > n) break;

                            if (i + j + k + l == n) count++;
                        }
                    }
                }
            }

            sb.append(count);
            sb.append('\n');
        }
        System.out.print(sb);
    }
}