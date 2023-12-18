import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        String s = scan.next();
        if(s.matches("[a, e ,i , o, u]")){
            System.out.println("vowel");
        }else{
            System.out.println("consonant");
        }
    }
}