import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int hours = 0;
    int minutes = 0;
    int seconds = 0;
    
    
    try{
        int time = Integer.parseInt(br.readLine());
        
        hours = time / 3600;
        
        int x = time % 3600;
        minutes = x / 60;
        
        seconds = x % 60;
        
        
        
        System.out.println(hours+":"+minutes+":"+seconds);
        
        
    }catch(IOException e){}
    

    }
}