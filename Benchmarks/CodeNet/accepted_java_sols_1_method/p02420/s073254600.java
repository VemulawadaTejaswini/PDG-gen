import java.io.*;
import java.util.*;
import java.lang.*;

class Main {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        
        while(true){
            String s = scan.next();
            
            if(s.equals("-")){
                break;
            }
            
            int m = scan.nextInt();
            
            for(int i = 0; i < m; ++i){
                int h    = scan.nextInt();
                String t = s.substring(0, h);
                String b = s.substring(h);
                
                s = b + t;
            }
            
            System.out.println(s);
        }
    }
}
