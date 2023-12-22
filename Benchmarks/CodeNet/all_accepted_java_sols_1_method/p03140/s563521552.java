import java.util.*;
import java.io.*;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String a = sc.next(), b = sc.next(), c= sc.next();
        int ans = 0;
        for(int i=0;i<n;i++){
            char a1 = a.charAt(i), b1 = b.charAt(i), c1 = c.charAt(i);
            if(a1==b1&&a1==c1) continue;
            if(a1==b1||a1==c1||b1==c1) ans += 1;
            else ans += 2;
        }
        System.out.println(ans);
    }
}
