import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s = in.readLine();
        int ans = 0;
        if (s.charAt(0) == 'R') {
            if (s.charAt(1) == 'R') {
                if (s.charAt(2) == 'R') {
                    ans = 3;
                } else {
                    ans = 2;
                }
            } else {
                ans = 1;
            }
        } else {
            if (s.charAt(1) == 'R') {
                if (s.charAt(2) == 'R') {
                    ans = 2;
                } else {
                    ans = 1;
                }
            } else {
                ans = (s.charAt(2) == 'R') ? 1 : 0;
            }
        }
        System.out.println(ans);
    }
}
