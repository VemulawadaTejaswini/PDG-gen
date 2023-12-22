import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] line = br.readLine().split(" ", 0);
        int min = Integer.MAX_VALUE, max = -Integer.MAX_VALUE, num = 0;
        for (int i = 0; i < 3; i++) {
            num = Integer.parseInt(line[i]);
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        System.out.println(min + " " + max);
    }
}

