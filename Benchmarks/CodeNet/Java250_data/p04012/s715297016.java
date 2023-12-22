import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String word = input.readLine();

        int[] freq = new int[26];

        for (int i = 0; i < word.length(); i++) {
            if (freq[word.charAt(i) - 'a'] == -1)
                freq[word.charAt(i) - 'a'] = 0;
            freq[word.charAt(i) - 'a']++;
        }
        boolean state = true;
        for (int i = 0; i < 26; i++) {
            if (freq[i] % 2 != 0) {
                state = false;
                break;
            }
        }

        System.out.println(state?"Yes": "No");

    }
}
