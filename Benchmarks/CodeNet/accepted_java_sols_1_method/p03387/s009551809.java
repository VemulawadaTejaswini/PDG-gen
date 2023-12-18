import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] abc = br.readLine().split(" ");
        int a = Integer.parseInt(abc[0]);
        int b = Integer.parseInt(abc[1]);
        int c = Integer.parseInt(abc[2]);
        
        int max = Math.max(Math.max(a,b),c);
        a = max - a;
        b = max - b;
        c = max - c;
        
        int ans = 0;
        int res = a%2 + b%2 + c%2;
        
        ans += a/2 + b/2 + c/2;
        
        if(res == 0) System.out.println(ans);
        else if(res == 1) System.out.println(ans+2);
        else System.out.println(ans+1);
    }

}
