import java.util.*;
import java.math.*;
import java.io.*;


public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]) {
        int n = sc.nextInt();
        int ans = 0;
        for(int i = 1; i <= n; i++) {
            if(String.valueOf(i).length() % 2 == 1) ans++;
        }
        System.out.println(ans);
    } 
}