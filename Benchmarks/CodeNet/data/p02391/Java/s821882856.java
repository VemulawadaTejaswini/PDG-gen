import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    
    try{
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        
        if (a<b){
            System.out.println("a < b");
        }
        
        if (a>b){
            System.out.println("a > b");
        }
        
        if (a==b){
            System.out.println("a == b");
        }
        
        
        
    }catch(IOException e){}
    

    }
}