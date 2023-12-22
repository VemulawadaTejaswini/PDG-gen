import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

class Main {
    public static void main (String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int d;
        StringBuilder sb = new StringBuilder("");

        while (sc.hasNextInt()) {
            d = sc.nextInt();
            sb.append(100 * (600 - d) * (1200 - d));
            sb.append('\n');
        }

        System.out.print(sb);
    }
}