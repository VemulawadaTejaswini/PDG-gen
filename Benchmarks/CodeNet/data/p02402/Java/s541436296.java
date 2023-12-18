import java.util.*;
import java.lang.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int min = Integer.MAX_VALUE;
        int max = -1 * Integer.MAX_VALUE;
        long sum = 0;
        
        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            if (k < min) { min = k; }
            if (k > max) { max = k; }
            sum += k;
        }
        
        System.out.println(min + " " + max + " " + sum);
    }
}
