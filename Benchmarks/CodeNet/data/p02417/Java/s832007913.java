import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {

    public static void main(String args[]) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in, "ISO-8859-1");
        OutputStreamWriter ow = new OutputStreamWriter(System.out, "ISO-8859-1");
        BufferedWriter bw = new BufferedWriter(ow);
        BufferedReader br = new BufferedReader(ir);
        int[] count = new int[26];
        String input;
        while ((input = br.readLine()) != null) {
            for (char c : input.toCharArray()) {
                if (c >= 'a' && c <= 'z') {
                    count[c - 'a']++;
                } else if (c >= 'A' && c <= 'Z') {
                    count[c - 'A']++;
                }
            }
        }
        for (int i = 'a'; i <= 'z'; i++) {
            bw.append((char) i + " : " + count[i - 'a'] + "\n");
        }
        bw.flush();
    }

}
