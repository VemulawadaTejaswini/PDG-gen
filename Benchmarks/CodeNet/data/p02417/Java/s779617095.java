import java.io.*;
  
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String sentence;
        int[] abc = new int[26];
        while ((sentence = input.readLine()) != null) {
            int line_len = sentence.length();
            for (int i = 0; i < line_len; i++) {
                char index = solveIndex(sentence.charAt(i));
                if (index >= 0 && index < 26)
                    abc[index]++;
            }
        }
        char cc = 'a';
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            sb.append(cc++).append(" : ").append(abc[i]).append('\n');
        }
        System.out.print(sb.toString());
    }
    private static char solveIndex(char c) {
        if (c >= 'a' && c <= 'z')
            c -= 'a';
        else if (c >= 'A' && c <= 'Z')
            c -= 'A';
        return c;
    }
}