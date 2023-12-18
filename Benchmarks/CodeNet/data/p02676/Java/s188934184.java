import java.io.*;
import java.util.*;
import java.lang.*;

public class Main
{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        String s = sc.nextLine();
        if (s.length() <= k) {
            System.out.println(s);
        }
        else {
            System.out.println(s.substring(0, k) + "...");
        }
        
    
    }
}
