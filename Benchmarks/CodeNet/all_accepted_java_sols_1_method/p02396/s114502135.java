import java.io.*;
import java.util.*;

class Main {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int num = 1;
        
        while(true){
            int n = scan.nextInt();
            
            if(n == 0) {
            	break;
            	}
            
            System.out.println("Case " + num++ + ": " + n);
        }
    }
}