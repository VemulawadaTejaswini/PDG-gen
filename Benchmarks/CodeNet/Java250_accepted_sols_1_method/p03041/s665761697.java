import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] in = br.readLine().split(" ");
        int k = Integer.parseInt(in[1]);
        char[] s = br.readLine().toCharArray();
        s[k - 1] = (char) (s[k - 1] - 'A' + 'a');
        System.out.println(String.valueOf(s));

        br.close();
    }
}