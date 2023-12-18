import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int n = Integer.parseInt(input.readLine());
        
        int[] x = new int[n+1];
        int[] y = new int[n+1];
        String[] xys = new String[2];
        for(int i = 1;i <= n;i++){
            xys = input.readLine().split(" ", 0);
            x[i] = Integer.parseInt(xys[0]);
            y[i] = Integer.parseInt(xys[1]);
            
        }
        
        
        int count,pow;
        int[] cango = new int[n+1];
        for(int i = 1;i <= n;i++){
            cango[i] +=  Math.pow(2,i-1);
            
            for(int j = i+1;j <= n;j++){
                
                if(x[i] < x[j] && y[i] < y[j]){
                    cango[i] +=  Math.pow(2,j-1);
                    cango[j] +=  Math.pow(2,i-1);
                    
                }else if(x[i] > x[j] && y[i] > y[j]){
                    cango[i] +=  Math.pow(2,j-1);
                    cango[j] +=  Math.pow(2,i-1);
                }
                
                
                count = 0;
            }
            
            
            
            
        }
        
        int a=0;
        for(int i = 1;i <= n;i++){
            a = cango[i];
            
            for(int j = 1;j <= n;j++){
                if(i==j) continue;
                if((cango[i] & (int)Math.pow(2,j-1)) != 0){
                        a |= cango[j];
                }
            }
            
            out.println(Integer.bitCount(a));
            
        }
        out.flush();
    }
    
}
