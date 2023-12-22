import java.util.*;
import java.io.*;
import java.lang.*;
public class Main{

     public static void main(String []args) throws Exception {
        Scanner sc = new Scanner(System.in);
        //BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
        int x = sc.nextInt();
        
        //String s = inp.readLine().trim();
        int ans = 0;
        int a = x ;
        int d = a/500;
            
            if(d > 0){
                ans = ans + d*1000;
                a = a - d*500;
            }
            int s = a/5;
            if(a > 0){
                ans = ans + s*5;
                a = a - s*5;
            }
        
        System.out.println(ans);
        
        
     }
}