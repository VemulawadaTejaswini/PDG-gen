import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Shuji on 2017/01/01.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder();

        String input = br.readLine();
        int n = Integer.parseInt(input);
        input = br.readLine();
        String[] strArray = input.split(" ");

        for (int i = (n - 1); i >= 0; i--) {
            int x = Integer.parseInt(strArray[i]);
            output.append(x);
            output.append(" ");
        }
        output.append("\n");

        try {
            System.out.print(output);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}