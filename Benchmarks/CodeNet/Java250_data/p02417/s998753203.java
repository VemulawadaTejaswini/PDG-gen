
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
//            char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
            char[] alphabet = new char[26];
            char word = 'a';
            for (int x = 0; x <= ('z') - ('a'); x++) {
                alphabet[x] = word++;
            }

            int[] sum = new int[26];
            String line = null;
            while ((line = reader.readLine()) != null) {
                char[] chaAryLine = line.toLowerCase().toCharArray();

                for (int i = 0; i < line.length(); i++) {
                    for (int j = 0; j < sum.length; j++) {
                        if (alphabet[j] == chaAryLine[i]) {
                            sum[j]++;
                            break;
                        }
                    }
                }
            }
            for (int i = 0; i < 26; i++) {
                System.out.println(alphabet[i] + " : " + sum[i]);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}