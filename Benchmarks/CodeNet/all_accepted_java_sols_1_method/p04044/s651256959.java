import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String[] firstLine = input.readLine().split(" ");
        int N = Integer.parseInt(firstLine[0]);
        int L = Integer.parseInt(firstLine[1]);

        String[] strings = new String[N];

        for (int i = 0; i < N; i++) {
            strings[i] = input.readLine();
        }

        Arrays.sort(strings);

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < N; i++) {
            builder.append(strings[i]);
        }
        System.out.println(builder.toString());
    }
}