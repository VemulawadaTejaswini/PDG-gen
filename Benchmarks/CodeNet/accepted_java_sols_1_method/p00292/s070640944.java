import java.util.*;
 
import javax.xml.crypto.Data;
 
import java.math.*;
 
public class Main {
     
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] k = new int[n];
        int[] p = new int[n];
        for(int i = 0; i < n; i++) {
            k[i] = sc.nextInt();
            p[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++) {
            int s = k[i];
            int now = 0;
            while(s != 0) {
                now %= p[i];
                now++;
                s--;
            }
            System.out.println(now);
        }
    }
     
}