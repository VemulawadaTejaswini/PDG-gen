import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(input.readLine());
        
        int[] x = new int[n+1];
        int[] y = new int[n+1];
        String xy;
        String[] xys = new String[2];
        for(int i = 1;i <= n;i++){
            xy = input.readLine();
            xys = xy.split(" ", 0);
            x[i] = Integer.parseInt(xys[0]);
            y[i] = Integer.parseInt(xys[1]);
            
        }
        
        
        int count,pow;
        int[] cango = new int[n+1];
        for(int i = 1;i <= n;i++){
            
            
            for(int j = 1;j <= n;j++){
                if(i == j){
                cango[i] +=  Math.pow(2,j-1);
                continue;
            }
                if(x[i] <= x[j] && y[i] <= y[j]){
                    cango[i] +=  Math.pow(2,j-1);
                }else if(x[i] > x[j] && y[i] > y[j]){
                    cango[i] +=  Math.pow(2,j-1);
                }
                count = 0;
            }
            
            
        }
        
        int a=0,bits=0;
        for(int i = 1;i <= n;i++){
            a = cango[i];
            
            for(int j = 1;j <= n;j++){
                if(i==j) continue;
                if((cango[i] & (int)Math.pow(2,j-1)) != 0){
                        a |= cango[j];
                }
            }
            System.out.println(Integer.bitCount(a));
        }
          
    }
}