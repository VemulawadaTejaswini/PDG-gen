import java.util.*;
import java.io.*;

public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();   
        int b = sc.nextInt();   
        String sa = "";
        String sb = "";
        for (int i = 0; i < b; i++) {
            sa += a; 
        }
        for (int i = 0; i < a; i++) {
            sb += b; 
        }
        String[] s = {sa, sb};
        Arrays.sort(s);
        System.out.println(s[0]);
    }
}