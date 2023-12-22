import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int a = Integer.parseInt(input[1]);
        int b = Integer.parseInt(input[2]);
        int ans = 0;
        
        for(int i = 1; i <= n; i++){
            if(a <= calEachNum(i) && calEachNum(i) <= b){
                ans += i;
            }
        }
        
        out.println(ans);
        out.close();
        
    }
    
    public static int calEachNum(int x){
            
        int total = 0;
        boolean isLast = false;
            
        while(!isLast){
            if(x >= 10){
                total += x % 10;
                x /= 10;
            }else{
                total += x;
                isLast = true;
            }
        }
        return total;
    }
}