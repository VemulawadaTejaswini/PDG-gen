import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

/**
 * Created by ylc265 on 10/16/15.
 */
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(in.readLine());
        StringBuilder sb = new StringBuilder();
        int max = 0;
        String maxString = "";
        int maxCount = 0;
        HashMap<String, Integer> mp = new HashMap<String, Integer>();
        while (tk.hasMoreTokens()) {
            String word = tk.nextToken();
            if (word.length() > max) {
                max = word.length();
                maxString = word;
            }
            int value = 1;
            if (mp.containsKey(word)) {
                value += mp.get(word);
                if (maxCount < value) {
                    maxCount = value;
                }
            }
            mp.put(word, value);
        }
        for (String key : mp.keySet()) {
            if (mp.get(key) == maxCount) {
                sb.append(key).append(' ');
                break;
            }
        }
        sb.append(maxString).append('\n');
        System.out.print(sb);

    }
}