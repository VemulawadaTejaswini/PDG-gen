import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (sc.hasNextInt()) {
            int d = Integer.parseInt(br.readLine());
            System.out.println(100 * (600 - d) * (1200 - d));
        }
    }
}