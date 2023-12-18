import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        int l = s.length();

        if((l%2==0 && s.charAt(0)==s.charAt(l-1)) || (l%2!=0 && s.charAt(0)!=s.charAt(l-1))){
            System.out.println("First");
        }
        else{
            System.out.println("Second");
        }
    }
}