import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args)throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String word = input.readLine();
        Stack<Character> characters = new Stack<>();

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'B' && !characters.isEmpty()){
                characters.pop();
            }else if (word.charAt(i) == '1' || word.charAt(i) == '0'){

                characters.push(word.charAt(i));
            }
        }

        StringBuilder out = new StringBuilder();

        for (int i = 0; i < characters.size(); i++) {
            out.append(characters.get(i));
        }

        System.out.println(out);
    }
}
