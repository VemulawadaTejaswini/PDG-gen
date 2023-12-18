import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main {
    public static void main(String[] args) {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String line;
        int c;
        int[] amounts = new int[26];

        try {
            while ((line = buf.readLine()) != null) {
                for (int j = 0; j < line.length(); j++) {
                    c = (int)line.charAt(j);
                        for (int i = 0; i < 26; i++) {
                            if (c == 97 + i || c == 65 + i) { // 97+の方で小文字と、65+の方で大文字との合致を判定
                                amounts[i] += 1;
                            }
                    }
                }
            }
            for (int i = 0; i < 26; i++) {
                System.out.println((char)(i + 97) + " : " + amounts[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}