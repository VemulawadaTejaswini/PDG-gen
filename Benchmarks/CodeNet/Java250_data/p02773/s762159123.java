//package AtCoder.ABC155;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        HashMap<String, Integer> ma = new HashMap<>();
        int n = in.NI();
        int maxcoun = 0;
        for (int i=0;i<n;i++) {
            String x = in.next();
            if (!(ma.containsKey(x))) {
                ma.put(x, 1);
                maxcoun = Integer.max(maxcoun, 1);
            } else {
                int pval = ma.get(x);
                ma.put(x, pval+1);
                maxcoun = Integer.max(maxcoun, pval+1);
            }
        }
        List<String> ans = new ArrayList<>();
        for (String key: ma.keySet()) {
            if (ma.get(key ) == maxcoun) {
                ans.add(key);
            }
        }
        Collections.sort(ans);
        for (int i=0;i<ans.size();i++){
            out.println(ans.get(i));
        }
        out.close();
    }

    static InputStream inputStream = System.in;
    static OutputStream outputStream = System.out;
    static InputReader in = new InputReader(inputStream);
    static PrintWriter out = new PrintWriter(outputStream);

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int NI() {
            return Integer.parseInt(next());
        }

        public long NL() {
            return Long.parseLong(next());
        }

    }
}