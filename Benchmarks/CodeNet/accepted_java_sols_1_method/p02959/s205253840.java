import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n + 1];
        long[] b = new long[n];
        
        for (int i = 0; i < n + 1; i++) {
            a[i] = sc.nextLong();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextLong();
        }
        
        long sum = 0, residue = 0, ability;
        for (int i = 0; i < n + 1; i++) {
            if (i != n) {
                ability = b[i] + residue;
                residue = Math.min(ability - a[i], b[i]);
                residue = Math.max(residue, 0);
            } else {
                ability = residue;
            }
            
            if (a[i] < ability) {
                sum += a[i];
            } else {
                sum += ability;
            }
        }
        System.out.println(sum);
    }
    
}