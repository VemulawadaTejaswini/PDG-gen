import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    try{
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
    
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        
        int n = 0;
        int m = 0;
        
        n = x * y;
        m = 2 * (x + y);
        
        
        System.out.println(n);
        System.out.println(m);
        
        
        
    }catch(IOException e){}
    
    
    




    }
}