import java.util.*;
import java.io.*;

public class Main{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
            String s1 = in.next();
            String s2 = in.next();
            boolean check = false;
            int n = s1.length();
        for(int i =0 ; i< n; i++){
            if(s1.equals(s2)){
                check = true;
                break;
            }
            s1 = s1.charAt(n-1) + s1.substring(0 , n-1);
            // System.out.println(s1);
        }

            
         if(check)  System.out.println("Yes");
         else System.out.println("No");
    }
}