import java.io.*;
import java.util.*;
import java.lang.*;

class Main {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int n        = scan.nextInt();
        String s     = scan.next();
        
        for(int i = 1; i < n; ++i){
            String t = scan.next();
            
            if(s.compareTo(t) > 0){
                s = t;
            }
        }
        
        System.out.println(s);
    }
}