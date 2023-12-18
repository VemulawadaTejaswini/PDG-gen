import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int N = parseInt(read.readLine());
        int rem = N % 1000;
        if (rem > 0) {
            System.out.println(1000 - rem);
        } else {
            System.out.println(0);
        }

    }
}
