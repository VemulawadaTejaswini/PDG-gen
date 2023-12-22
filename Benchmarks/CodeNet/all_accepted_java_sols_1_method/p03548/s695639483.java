import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        String[] inputs = reader.readLine().split(" ");
        int X = Integer.parseInt(inputs[0]);
        int Y = Integer.parseInt(inputs[1]);
        int Z = Integer.parseInt(inputs[2]);

        int num = 0;
        while (num <= (X - Z) / (Y + Z)) {
            num += 1;
        }

        System.out.println(num-1);

    }
}