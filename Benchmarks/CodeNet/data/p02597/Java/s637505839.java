import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(buffer.readLine());
        String inp = buffer.readLine();
        int posR = inp.indexOf('R');
        int freqWBeforeR = 0;
        for (int pos = 0; pos < posR + 1; pos++) {
            if (inp.charAt(pos)=='W')freqWBeforeR++;
        }
        int freqOfR =0;
        for (char ch:inp.toCharArray()) {
            if (ch == 'R') freqOfR++;
        }
        freqOfR--;
        if (inp.indexOf('W')==-1||inp.indexOf('R')==-1||inp.indexOf('W')>inp.lastIndexOf('R'))
            sb.append(0+"\n");
        else
            sb.append(Math.max(freqOfR, freqWBeforeR));
        System.out.println(sb);
    }
}
