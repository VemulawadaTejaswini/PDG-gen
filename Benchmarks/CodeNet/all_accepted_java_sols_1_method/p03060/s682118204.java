import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] v = new int[n];
        int[] c = new int[n];
        int sum = 0;
        
        for (int i = 0; i < n; i++) {
            v[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            c[i] = sc.nextInt();
        }
        
        for (int i = 0; i < n; i++) {
            int p = v[i] - c[i];
            if (p > 0) {
                sum += p;
            }
        }
        
        System.out.println(sum);
        
    }
}