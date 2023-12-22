import java.util.*;
import java.io.*;

public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   
        String s = sc.next();
        int cnt = 0;
        for (int i = 0; i < n-2; i++) {
            if (s.charAt(i) == 'A') {
                if (s.charAt(i+1) == 'B') {
                    if (s.charAt(i+2) =='C') {
                        cnt++;
                    }
                }
            }
        }        
        
        System.out.println(cnt);
    }
}