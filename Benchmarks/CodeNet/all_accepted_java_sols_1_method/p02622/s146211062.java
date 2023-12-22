import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String a = buffer.readLine();
        String b = buffer.readLine();
        int cnt = 0;
        for (int pos = 0; pos < a.length(); pos++) {
            if (a.charAt(pos)!=b.charAt(pos))
                cnt++;
        }
        sb.append(cnt);
        System.out.println(sb);
    }
}
