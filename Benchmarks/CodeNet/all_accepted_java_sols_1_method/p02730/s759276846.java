import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) throws Exception {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        StringBuilder sb = new StringBuilder(S);
        String reverse_1 = sb.reverse().toString();

        String S_2 = S.substring(0, (S.length()-1)/2);
        StringBuilder sb_2 = new StringBuilder(S_2);
        String reverse_2 = sb_2.reverse().toString();

        String S_3 = S.substring((S.length()+3)/2 - 1, S.length());
        StringBuilder sb_3 = new StringBuilder(S_3);
        String reverse_3 = sb_3.reverse().toString();
        if(S.equals(reverse_1) && S_2.equals(reverse_2) && S_3.equals(reverse_3)) {
            out.println("Yes");
        }else {
            out.println("No");
        }
        out.flush();
        out.close();
        br.close();
    }
}