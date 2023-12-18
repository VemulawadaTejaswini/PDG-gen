import java.io.*;
import java.util.*;
public class Main{
    public static void main(String []args) throws Exception {
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        // int n = Integer.parseInt(br.readLine());
        // long [][] dp = new long[n+1][n+1];
        // ArrayList<String> list = new ArrayList<>();
        long n = sc.nextLong();
        long num  = 7 ;
        long len = 1;
        boolean got = false;
        boolean g = false;
        if(n%2 ==0 || n%5 == 0){
            g = true;
        }
        while( !got && !g){
            if(num%n==0){
                got = true;
                break;
            }
            num = num*10 + 7;
            len++;
        }
        
        if(g){
            System.out.println(-1);
        }else if(got || n ==1){
            System.out.println(len);    
        }else{
            System.out.println(-1);
        }
        
    }
}