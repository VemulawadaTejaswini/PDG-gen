import java.util.*;
import java.math.*;
import java.io.*;


public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]) {
        int n = sc.nextInt();
        int d = sc.nextInt();

        int ans = n / (2 * d + 1) + (n%(2 * d + 1)!=0?1:0);
        System.out.println(ans);
    } 
}