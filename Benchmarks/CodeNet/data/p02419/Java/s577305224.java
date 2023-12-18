
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String word = reader.readLine().toUpperCase();
        int count = 0;
        while (true) {

            String sentence = reader.readLine().toUpperCase();
            String[] words = sentence.split(" ");
            if (words[0].equals("END_OF_TEXT")) {
                break;
            } else {
                for (int i = 0; i < words.length; i++) {
                    if (word == words[i]) {
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}