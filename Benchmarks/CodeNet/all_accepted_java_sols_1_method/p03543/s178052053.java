import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        char[] inputs = reader.readLine().toCharArray();

        boolean isGood = false;
        for (int i = 0; i < 2; i++) {
            if (inputs[i] == inputs[i + 1] && inputs[i + 1] == inputs[i + 2]) {
                isGood = true;
            }
        }

        if(isGood) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
