import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] T = br.readLine().split(" ");
        LinkedList<String> word = new LinkedList<>();
        String input;
        while (!(input = br.readLine()).equals("END_OF_TEXT")) {
            word.add(input);
        }
        int count = 0;
        for (String t : T) {
            Pattern pattern = Pattern.compile(t, Pattern.CASE_INSENSITIVE);
            for (String w : word) {
                Matcher matcher = pattern.matcher(w);
                while (matcher.find()) {
                    count++;
                }
            }
        }
        
        bw.append(count + "\n");
        bw.flush();
    }

}
