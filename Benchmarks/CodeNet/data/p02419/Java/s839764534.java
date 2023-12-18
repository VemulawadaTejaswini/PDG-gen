import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String t = br.readLine();
        int tSize = t.length();
        String w;
        int count = 0;
        while (!(w = br.readLine()).equals("END_OF_TEXT")) {
            int runLength = w.length() - tSize;
            for (int i = 0; i < runLength; i++) {
                if (w.charAt(i) == t.charAt(0) && (i + tSize) < w.length()) {
                    if (w.substring(i, i + tSize).equals(t)) {
                        count++;
                    }
                }
            }
        }
        bw.append(count + "\n");
        bw.flush();
    }


}
