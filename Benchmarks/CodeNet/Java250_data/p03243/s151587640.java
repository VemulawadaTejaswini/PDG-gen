import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char c = s.charAt(0);
        String a = "";
        String b = "";
        for (int i = 0; i<s.length(); i++){
            a += c;
        }
        for (int i = 0; i<s.length(); i++){
            b += Integer.parseInt(String.valueOf(c))+1;
        }
        if (Integer.parseInt(a) >= Integer.parseInt(s))
            System.out.println(a);
        else
            System.out.println(b);
    }
}