import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println((char)(s.charAt(0)) + Integer.toString(s.length() - 2) + (char)s.charAt(s.length()-1));
        System.out.println();
        sc.close();
    }
}