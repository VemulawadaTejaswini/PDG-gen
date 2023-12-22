import java.util.*;
import java.lang.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            int n = sc.nextInt();
            if (n == 0) break;
            
            double[] s = new double[n];
            double m = 0;
            double var = 0;
            double sd = 0;
        
            for (int i = 0; i < n; i++){
                s[i] = sc.nextInt();
                m += s[i];
            }
            m /= n;
            
            for (int i = 0; i < n; i++) {
                var += Math.pow(s[i] - m, 2);
            }
            var /= n;
            
            sd = Math.sqrt(var);
            
            System.out.println(sd);
        }
    }
}
