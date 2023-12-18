import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    static int[] count;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input;
        while ((input = br.readLine()) != null) {
            count = new int[26];
            input = input.toLowerCase();
            for (char c : input.toCharArray()) {
                if (c >= 'a' && c <= 'z')
                    count[c - 'a']++;
            }
            for (int i = 'a'; i <= 'z'; i++) {
                bw.append((char) i + " : " + count[i - 'a'] + "\n");
            }
        }
        bw.flush();
    }

}

