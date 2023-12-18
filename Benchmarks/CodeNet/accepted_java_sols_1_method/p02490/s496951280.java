import java.io.*;
import java.util.*;
import java.lang.*;

class Main {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        
        while(true){
            int x = scan.nextInt();
            int y = scan.nextInt();
            
            if(x == 0 && y == 0) break;
            
            System.out.println(Math.min(x, y) + " " + Math.max(x, y));
        }
        
    }
}