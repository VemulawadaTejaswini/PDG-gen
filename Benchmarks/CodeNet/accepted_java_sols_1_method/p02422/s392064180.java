import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text = br.readLine();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String[] lines = br.readLine().split(" ");
            int begin = Integer.parseInt(lines[1]);
            int end = Integer.parseInt(lines[2]) + 1;
            if (lines[0].equals("print")) {
                System.out.println(text.substring(begin, end));
            } else if (lines[0].equals("replace")) {
                char[] oldWord = text.toCharArray();
                char[] newWord = lines[3].toCharArray();
                for (int j = begin, k = 0; j < end; j++) {
                    oldWord[j] = newWord[k++];
                }
                text = String.valueOf(oldWord);
            } else {
                char[] reverseWord = text.toCharArray();
                char[] tempText = text.toCharArray();
                for (int j = begin, k = end - 1; j < end; j++, k--) {
                    tempText[j] = reverseWord[k];
                }
                text = String.valueOf(tempText);
            }
        }
    }
}