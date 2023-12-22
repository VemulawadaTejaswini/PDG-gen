import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        init();
        nextInt();
        String s = next();
        int times = 0;
        int curr = 0;
        char[] looking = {'A', 'B', 'C'};
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == looking[curr]) curr++;
            else {
                curr = 0;
                if (s.charAt(i) == looking[curr]) curr++;
            }
            if (curr == 3) {
                times++;
                curr = 0;
            }
        }
        System.out.println(times);
    }

    //Input Reader
    private static BufferedReader reader;
    private static StringTokenizer tokenizer;

    private static void init() {
        reader = new BufferedReader(new InputStreamReader(System.in));
        tokenizer = new StringTokenizer("");
    }

    private static String next() throws IOException {
        String read;
        while (!tokenizer.hasMoreTokens()) {
            read = reader.readLine();
            if (read == null || read.equals(""))
                return "-1";
            tokenizer = new StringTokenizer(read);
        }

        return tokenizer.nextToken();
    }

    private static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }
}