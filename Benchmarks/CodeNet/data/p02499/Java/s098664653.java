import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Main {
    public static void main(String[] args) {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        String lineBuffer = null, allLine = "";
        int index = 0;
        int[] numAlphabet = new int[26];
        try {
            while ((lineBuffer = stdin.readLine()) != null)
                allLine += lineBuffer;
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Unexpected Error");
        }
        char[] in = allLine.toCharArray();
         
        for (int i = 0; i < allLine.length(); ++i) {
            index = Character.toLowerCase(in[i]) - 'a';
            if (0 <= index && index <= 26)
                ++numAlphabet[index];
        }
         
        for (int i = 0; i < 26; ++i)
            System.out.println((char)(i + 'a') + " : " + numAlphabet[i]);
    }
}