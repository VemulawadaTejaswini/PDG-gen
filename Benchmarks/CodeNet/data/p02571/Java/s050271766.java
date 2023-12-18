import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String S = buffer.readLine();
        String T = buffer.readLine();
        int startPos = 0, maxLen = -1;
        for (int pos = 0; pos < S.length(); pos++) {
            int index = T.indexOf(S.charAt(pos));
            if (index==-1 || pos < index)continue;
            int len = 0, tempPos = pos;
            while (tempPos<S.length() && index<T.length() && T.charAt(index)==S.charAt(tempPos)) {
                len ++;
                tempPos++;
                index++;
            }
            if (len>maxLen && T.length()-index<=S.length()-tempPos){
                maxLen = len;
                startPos = pos;
            }
        }
        System.out.println(T.length()-maxLen);
    }
}
