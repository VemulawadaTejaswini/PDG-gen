import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long n = Long.parseLong(br.readLine());
        
        br.close();

        StringBuilder ans = new StringBuilder();

        while (n > 0) {
            n--;
            ans.append((char)('a' + n % 26));
            n /= 26;
        }
        
        ans.reverse();
        
        bw.write(ans.toString());

        bw.flush();

    }
}