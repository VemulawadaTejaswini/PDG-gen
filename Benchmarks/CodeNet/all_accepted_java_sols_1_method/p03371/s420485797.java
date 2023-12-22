import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] abcxy = br.readLine().split(" ");
        int a = Integer.parseInt(abcxy[0]);
        int b = Integer.parseInt(abcxy[1]);
        int c = Integer.parseInt(abcxy[2]);
        int x = Integer.parseInt(abcxy[3]);
        int y = Integer.parseInt(abcxy[4]);
        
        int cost = 0;
        
        if(a+b > c*2){
            int min = x < y ? x : y;
            x -= min; 
            y -= min;
            
            cost += c * min * 2;
            int rest = x > 0 ? a : b;
            if(rest > c*2)
                cost += c * (x+y) * 2;
            else
                cost += a*x + b*y;
        }
        else{
            cost += a*x + b*y;
        }
        System.out.println(cost);
    }
}
