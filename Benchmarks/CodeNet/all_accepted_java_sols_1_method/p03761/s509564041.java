import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(input.readLine());
        int[][] letters = new int[n][26];
        for (int i = 0; i < n; i++) {

            String S = input.readLine();

            for (int j = 0; j < S.length(); j++) {
                letters[i][S.charAt(j) - 'a'] += 1;
            }
        }

        int[] commonLetters = letters[0];

        for (int i = 0; i < 26; i++) {
            for (int j = 1; j < n; j++) {
                if (commonLetters[i] <= letters[j][i]) {

                } else {
                    commonLetters[i] = letters[j][i];
                }

            }
        }

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < commonLetters[i]; j++) {
                builder.append((char) ('a' + i));
            }
        }

        System.out.println(builder.toString());


    }

}