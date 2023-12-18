import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Main {
    BufferedReader br;
    Main() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }
    public static void main(String[] args) {
        new Main().run();
    }
    void debug(Object ... o) {
        System.out.println(Arrays.deepToString(o));
    }
    int N;
    String in;
    String [] cand;
    void init() {
        try {
            N = Integer.parseInt(br.readLine());
            cand = new String[N];
            in = br.readLine();
            for (int i = 0; i < N; i++) cand[i] = br.readLine();
        } catch (Exception e) {}
    }
    void run() {
        init();
        int c = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 20; j++) {
                StringBuilder sb = new StringBuilder();
                sb.append(".*");
                sb.append(in.charAt(0));
                for (int k = 1; k < in.length(); k++) {
                    for (int l = 0; l < j; l++) sb.append('.');
                    sb.append(in.charAt(k));
                }
                sb.append(".*");
                String pattern = sb.toString();
                if (Pattern.matches(pattern, cand[i])) {
                    c++;
                    break;
                }
            }
        }
        System.out.println(c);
    }
}