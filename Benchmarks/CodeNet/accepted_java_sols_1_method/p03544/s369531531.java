import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        int input = Integer.parseInt(reader.readLine());
        long[] ryuka = new long[87];
        ryuka[0] = 2;
        ryuka[1] = 1;
        for (int i = 2; i < 87; i++) {
            ryuka[i] = ryuka[i - 1] + ryuka[i - 2];
        }

        System.out.println(ryuka[input]);
    }
}
