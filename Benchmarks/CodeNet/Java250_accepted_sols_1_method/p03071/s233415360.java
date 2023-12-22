import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int ans = 0;
        
        if (a>b){
            ans += a;
            a--;
            ans += Math.max(a,b);
        }else{
            ans += b;
            b--;
            ans += Math.max(a,b);
        }System.out.println(ans);


    }
}
