import java.io.*;
   
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String sentence;
        int[] abc = new int[26];
        while ((sentence = input.readLine()) != null) {
            int line_len = sentence.length();
            for (int i = 0; i < line_len; i++) {
                int index = sentence.charAt(i) - 'a';
                if (index >= 0 && index < 26)
                    abc[index]++;
            }
        }
        char cc = 'a';
        for (int i = 0; i < abc.length; i++) {
            System.out.println(cc + " : " + abc[i]);
            cc++;
        }
    }
}