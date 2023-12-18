import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    static final int INF = 1000000000;     
    
    public static void main(String[] args) throws Exception {                
        Scanner input = new Scanner(System.in);
        int a, b, c;
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        int min = Math.min(a, Math.min(b, c));
        int max = Math.max(a, Math.max(b, c));
        System.out.print(min);
        if (a != min && a != max) System.out.print(" " + a + " ");
        else if (b != min && b != max) System.out.print(" " + b + " ");
        else System.out.print(" " + c + " ");
        System.out.println(max);
    }         
}