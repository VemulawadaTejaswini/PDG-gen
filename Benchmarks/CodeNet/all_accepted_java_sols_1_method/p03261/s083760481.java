import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int N = Integer.parseInt(br.readLine());
        String output = "Yes";
        String before = "";
        Set<String> wordSet = new HashSet<>();
        for (int i = 0; i < N; i++) {
            String word = br.readLine();
            if (before.equals("") 
                || (before.charAt(before.length() - 1) == word.charAt(0)
                && !wordSet.contains(word))) {
                wordSet.add(word);
                before = word;
            } else {
                output = "No";
                break;
            }
        }
        out.println(output);
        out.close();
    }
}