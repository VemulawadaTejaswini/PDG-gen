import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String s, p;
        s = input.readLine();
        if (s != null && s.length() > 0 && s.length() <= 100) {
            p = input.readLine();
            if (p != null && p.length() > 0 && p.length() <= s.length()) {
                s += s.substring(0, s.length() - 1);
                System.out.println(
                    s.indexOf(p) == -1? "No": "Yes"
                );
            }
        }
    }
}