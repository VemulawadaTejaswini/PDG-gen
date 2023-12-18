import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

class Main {

    public static void main(String[] args) throws IOException {
        doit(args, System.in, System.out);
    }

    static void doit(String[] args, InputStream in, PrintStream out)
            throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        String[] words = reader.readLine().split(" ");
        Map<String, Integer> countMap = new HashMap<String, Integer>();
        int maxCount = 0;
        String maxCountWord = null;
        int maxLength = 0;
        String maxLengthWord = null;
        for (String word : words) {
            Integer count = countMap.get(word);
            if (count == null) {
                count = new Integer(1);
            } else {
                count += 1;
            }
            countMap.put(word, count);

            if (count > maxCount) {
                maxCount = count;
                maxCountWord = word;
            }

            int length = word.length();
            if (length > maxLength) {
                maxLength = length;
                maxLengthWord = word;
            }
        }
        out.println(maxCountWord + " " + maxLengthWord);
    }
}