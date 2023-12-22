import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(s.lastIndexOf("Z") - s.indexOf("A")+1);
    }
}