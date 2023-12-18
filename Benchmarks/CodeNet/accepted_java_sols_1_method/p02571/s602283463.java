import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] s = br.readLine().toCharArray();
        char[] t = br.readLine().toCharArray();
        int minCount = t.length, count = 0;
        for(int i=0; i<=s.length-t.length; i++) {
            int temp = 0;
            count = 0;
            while(temp < t.length) {
                if(s[temp+i] != t[temp])
                    count++;
                temp++;
            }
            minCount = Math.min(minCount, count);
        }
        System.out.println(minCount);
        br.close();
    }
}