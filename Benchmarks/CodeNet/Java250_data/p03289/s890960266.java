import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String word = input.readLine();

        boolean state = true;

        state &= word.charAt(0) == 'A';
        boolean foundC = false;

        for (int i = 1; i < word.length(); i++) {
            if (!foundC && i >=2 && i <= word.length() -2 && word.charAt(i) == 'C'){
                foundC = true;
            }else if (!Character.isLowerCase(word.charAt(i))){
                state = false;
                break;
            }
        }

        if (foundC && state)
            System.out.println("AC");
        else
            System.out.println("WA");
    }
}
