import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            String word = input.substring(i,i+1);
            if(word.equals(word.toLowerCase())){
            word = word.toUpperCase();
            }else if(word.equals(word.toUpperCase())){
                word = word.toLowerCase();
            }
            output.append(word);
        }
        System.out.println(output);
            }

}