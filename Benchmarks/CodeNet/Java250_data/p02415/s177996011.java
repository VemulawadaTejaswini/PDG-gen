import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        String answer = "";
        for (int c : s1.toCharArray()) {
            c = c >= 65 && c <= 90 ? c + 32 : c >= 97 && c <= 122 ? c - 32 : c;
            answer += (char) c;
        }
        System.out.println(answer);
    }
}