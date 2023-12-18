import java.lang.*;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        
        int a = scan.nextInt();
        a += scan.nextInt();
        int b = scan.nextInt();
        
        if(a >= b) System.out.println("Yes");
        else System.out.println("No");
    }
}
