import java.util.*;
import java.math.*;
import java.io.*;


public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();
        for(int i = 0; i < n; i++) {
            if(i == k -1) {
                System.out.print(Character.toLowerCase(s.charAt(i)));
            } else {
                System.out.print(s.charAt(i));
            }
        }
        System.out.println();
    }
}