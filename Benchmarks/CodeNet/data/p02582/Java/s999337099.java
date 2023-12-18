import java.util.*;
import java.util.function.*;
import java.lang.*;
import java.math.*;
import java.io.*;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 3;
        String S = sc.next();
        int c=0, ans = 0;
        for(int n=0; n<N; n++){
            if(S.charAt(n)=='R') c++;
            else c=0;

            ans = Math.max(c, ans);
        }
        
        System.out.println(ans);


    }
}
