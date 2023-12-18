import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Pattern pattern = Pattern.compile(br.readLine());
        String w;
        int count = 0;
        while (!(w = br.readLine()).equals("END_OF_TEXT")) {
            Matcher matcher = pattern.matcher(w);
            while (matcher.find()) {
                count++;
            }
        }
        bw.append(count + "\n");
        bw.flush();
    }


}
