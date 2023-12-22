import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        String s = scan.next();
        boolean b = false;
        if(s.charAt(0) == s.charAt(1) && s.charAt(2) == s.charAt(3)){
            b = true;
        }else if(s.charAt(0) == s.charAt(2) && s.charAt(1) == s.charAt(3)){
            b = true;
        }else if(s.charAt(0) == s.charAt(3) && s.charAt(1) == s.charAt(2)){
            b = true;
        }
        if(s.charAt(0) == s.charAt(1) && s.charAt(1) == s.charAt(2) && s.charAt(2) == s.charAt(3)){
            b = false;
        }
        if(b){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}