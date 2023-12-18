import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        if(s.equals(t.substring(0,s.length()))) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}