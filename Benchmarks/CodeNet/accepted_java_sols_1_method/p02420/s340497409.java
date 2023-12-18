import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String text = "";
        while (!(text = br.readLine()).equals("-")) {
            int n = Integer.parseInt(br.readLine());
            while (n-- > 0) {
                int i = Integer.parseInt(br.readLine());
                text = text.substring(i) + text.substring(0, i);
            }
            bw.append(text + "\n");
        }

        bw.flush();
    }

}
