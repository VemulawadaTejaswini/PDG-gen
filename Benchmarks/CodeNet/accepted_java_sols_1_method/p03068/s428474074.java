import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int N = Integer.parseInt(br.readLine());
        String S = br.readLine();
        int K = Integer.parseInt(br.readLine());
        String s = "[^" + String.valueOf(S.charAt(K - 1)) + "]";
        String ans = S.replaceAll(s, "*");
        out.println(ans);
        out.close();
    }
}
