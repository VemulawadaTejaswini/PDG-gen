import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String[] word = input.readLine().trim().split("");
        Arrays.sort(word);
        System.out.println(!(word[1].equals(word[2])) && word[0].equals(word[1]) && word[2].equals(word[3]) ? "Yes" : "No");
    }
}
