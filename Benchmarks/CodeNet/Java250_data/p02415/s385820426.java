import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input;
        while ((input = br.readLine()) != null) {
            for (char c : input.toCharArray()) {
                if (c >= 'A' && c <= 'Z') {
                    bw.append((char) (c + 32));
                } else if (c >= 'a' && c <= 'z') {
                    bw.append((char) (c - 32));
                } else {
                    bw.append(c);
                }
            }
            bw.newLine();
        }
        bw.flush();
    }

}
