import java.util.*;
import java.io.*;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] a = s.toCharArray();
        int n = a.length;
        long ans = 0;
        int black = 0;
        for(int i=0;i<n;i++){
            if(a[i]=='B') black++;
            else ans += black;
        }
        PrintWriter out = new PrintWriter(System.out);
        out.println(ans);
        out.flush();
    }
}
