import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String w = br.readLine();
        int sum = 0;
        while (true) {
            String line = br.readLine();
            if (line.equals("END_OF_TEXT")) {
                break;
            }
            int n = 0;
            line = line.toLowerCase();
            while ((n = line.indexOf(w, n)) >= 0) {
                n++;
                sum++;
            }
        }
        System.out.println(sum);
    }
}