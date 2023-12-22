import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] s = br.readLine().toCharArray();
        long sum = 0;
        for(char i : s) {
            sum += (i - '0');
        }
        System.out.println(sum%9 == 0 ? "Yes" : "No");
        br.close();
    }
}