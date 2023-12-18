import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    private static String sentence;
    
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        sentence = br.readLine();
        
        sentence = sentence.replaceAll("peach","リンゴ");
        sentence = sentence.replaceAll("apple","peach");
        sentence = sentence.replaceAll("リンゴ","apple");
        
        System.out.println(sentence);
    }
}