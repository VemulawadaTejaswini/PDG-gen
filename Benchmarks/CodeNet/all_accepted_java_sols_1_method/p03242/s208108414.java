import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder word = new StringBuilder(input.readLine());
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == '1'){
                word.setCharAt(i, '9');
            }else{
                word.setCharAt(i, '1');
            }
        }
        System.out.println(word);
    }
}
