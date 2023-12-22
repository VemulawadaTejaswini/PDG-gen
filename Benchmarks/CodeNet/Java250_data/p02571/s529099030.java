import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        String S = stdin.readLine();
        String T = stdin.readLine();

        int tLen = T.length();
        int change = tLen;

        for(int i = 0; i+tLen <= S.length(); i++) {
            String s1 = S.substring(i, i+tLen);
            int tempLen = check(s1, T);
            if(tempLen < change)
                change = tempLen;
        }

        System.out.println(change);
        return;
    }

    public static int check(String S, String T){
        int change = 0;
        for (int i = 0; i < S.length(); i++) {
            String temp1 = S.substring(i, i + 1);
            String temp2 = T.substring(i, i + 1);
            if (!temp1.equals(temp2)) {
                change++;
            }
        }
        return change;
    }
}
