import java.util.*;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        double ad = (double)a;
        double bd = (double)b;
        
        
        
        System.out.print(a/b + " "+ a%b +" ");
        System.out.printf("%.5f\n", ad/bd);

    }
}

