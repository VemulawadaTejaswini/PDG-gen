import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        int N = Integer.parseInt(reader.readLine());
        String[] inputs = reader.readLine().split(" ");
        int min = 1000;
        int max = 0;
        for (int i = 0; i < N; i++) {
            int a = Integer.parseInt(inputs[i]);
            if (max < a) {
                max = a;
            }
            if (a < min) {
                min = a;
            }
        }
        System.out.println(max-min);

    }
}