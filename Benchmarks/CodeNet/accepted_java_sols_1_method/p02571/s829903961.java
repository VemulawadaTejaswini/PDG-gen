import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String S = buffer.readLine();
        String T = buffer.readLine();
        int  minLen = Integer.MAX_VALUE;
        for (int pos = 0; pos < S.length()-T.length()+1; pos++) {
            int currLen = 0;
            for (int i = 0; i < T.length(); i++) {
                if (T.charAt(i)!=S.charAt(pos+i))currLen++;
            }
            minLen = Math.min(minLen, currLen);
        }
        System.out.println(minLen);
    }
}
