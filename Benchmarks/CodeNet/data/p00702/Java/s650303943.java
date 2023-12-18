import java.io.*;
import java.util.*;

public class Main {
    BufferedReader br;
    String[] map = {"ld", "mb", "mp", "nc", "nd", "ng", "nt", "nw", "ps", "qu", "cw", "ts"};
    Main() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }
    int n;
    String[] ss;
    void init() {
        try {
            n = Integer.parseInt(br.readLine());
            ss = new String[n];
            for (int i = 0; i < n; i++) {
                ss[i] = br.readLine();
                for (int j = 0; j < map.length; j++) {
                    ss[i] = ss[i].replaceAll(map[j], Character.toString((char)('A'+j)));
                }
            }
        } catch (IOException e) {}
    }
    public static void main(String[] args) {
        new Main().run();
    }
    void run() {
        init();
        int[][] count = new int[300][300];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < ss[i].length()-1; j++) {
                if (ss[i].charAt(j+1) != ' ') {
                    count[ss[i].charAt(j)][ss[i].charAt(j+1)]++;
                }
            }
        }
        for (char c = 'a'; c <= 'z'; c++) {
            int max = 0;
            char max_char = 'a';
            for (char d = 'a'; d <= 'z'; d++) {
                if (count[c][d] > max) {
                    max_char = d;
                    max = count[c][d];
                }
            }
            for (char d = 'A'; d <= 'L'; d++) {
                if (count[c][d] > max) {
                    max_char = d;
                    max = count[c][d];
                }
            }
            String max_kan_char = Character.toString(max_char);
            if (Character.isUpperCase(max_char)) max_kan_char = map[max_char-'A'];
            System.out.println(c + " " + max_kan_char + " " + max);
        }
        for (char c = 'A'; c <= 'L'; c++) {
            int max = 0;
            char max_char = 'a';
            for (char d = 'a'; d <= 'z'; d++) {
                if (count[c][d] > max) {
                    max_char = d;
                    max = count[c][d];
                }
            }
            for (char d = 'A'; d <= 'L'; d++) {
                if (count[c][d] > max) {
                    max_char = d;
                    max = count[c][d];
                }
            }
            String max_kan_char = Character.toString(max_char);
            if (Character.isUpperCase(max_char)) max_kan_char = map[max_char-'A'];
            System.out.println(map[c-'A'] + " " + max_kan_char + " " + max);
        }
    }
}