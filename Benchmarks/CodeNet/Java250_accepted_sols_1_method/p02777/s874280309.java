import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        
        String s = scan.next();
        String t = scan.next();
        int a = scan.nextInt();
        int b = scan.nextInt();
        String u = scan.next();
        
        if(s.equals(u)){
            a--;
        }else{
            b--;
        }
        
        System.out.println(a + " " + b);
        
    }
}