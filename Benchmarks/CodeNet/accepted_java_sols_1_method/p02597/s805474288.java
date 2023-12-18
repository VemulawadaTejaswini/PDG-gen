import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuffer sb = new StringBuffer("");
        int n = Integer.parseInt(br.readLine().trim());
        char s[] = br.readLine().trim().toCharArray();
        int r=0,w=0;
        for(int i=0;i<n;i++) {
            if(s[i]=='W')++w;
            else ++r;
        }
        int ans = 0;
        if(w<=r) {
            for(int i=n-1;i>=n-w;--i) {
                if(s[i]!='W') ++ans;
            }
        } else {
            for(int i=0;i<r;++i) {
                if(s[i]!='R') ++ans;
            }
        }
        System.out.println(ans);
    }
}