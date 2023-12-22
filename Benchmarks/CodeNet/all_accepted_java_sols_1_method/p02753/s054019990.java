import java.util.*;
import java.lang.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        char[] s = br.readLine().toCharArray();
        int a = 0;
        int b = 0;
        for (int i = 0; i < s.length; i++) {
            a += s[i] == 'A' ? 1 : 0;
            b += s[i] == 'B' ? 1 : 0;
        }
        System.out.println((a == 2 || b == 2) ? "Yes" : "No");
    }
}