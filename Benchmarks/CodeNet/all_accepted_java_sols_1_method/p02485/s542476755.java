import java.io.*;
import java.util.*;
import java.lang.*;

class Main {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        
        while(true){
            String line = scan.nextLine();
            int s = 0;
            
            if(line.charAt(0) == '0'){
                break;
            }
            
            for(int i = 0; i < line.length(); ++i){
                s += Character.digit(line.charAt(i), 10);
            }
            
            System.out.println(s);
        }
    }
}