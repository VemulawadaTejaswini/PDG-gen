import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        int k1 = sc.nextInt();
        int k2 = sc.nextInt();
        String s = sc.next();
        if(s.equals(s1)){
            System.out.println((k1-1) + " " + k2);
        }else{
            System.out.println(k1 + " " + (k2-1));
        }
    }
}