import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String T = br.readLine().toLowerCase();

        int count = 0;
        String input;
        while (!(input = br.readLine()).equals("END_OF_TEXT")) {
            String[] word = input.toLowerCase().split(" ");
            for (String w : word) {
                if (T.equals(w)) {
                    count++;
                }
            }
        }

        bw.append(count + "\n");
        bw.flush();
    }

}
