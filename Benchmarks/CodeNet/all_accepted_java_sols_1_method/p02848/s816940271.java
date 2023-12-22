import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String s = br.readLine();
        String alph = "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZABC";
        String out = "";
        for (int i=0; i<s.length(); i++) {
            int temp = alph.indexOf(s.charAt(i));
            temp += N;
            out += alph.charAt(temp);
        }
        System.out.println(out);
    }
}
