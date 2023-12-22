import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] counts = new int[26];

        while (true) {
            String line = br.readLine();

            if (line == null) {
                break;
            }

            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);
                if (isUppercase(c)) {
                    counts[c - 'A']++;
                } else if (isLowercase(c)) {
                    counts[c - 'a']++;
                }
            }
        }

        for (int i = 0; i < 26; i++) {
            System.out.println((char) (i + 'a') + " : " + counts[i]);
        }
    }

    private static boolean isUppercase(char c) {
        return (c >= 'A' && c <= 'Z');
    }

    private static boolean isLowercase(char c) {
        return (c >= 'a' && c <= 'z');
    }
}