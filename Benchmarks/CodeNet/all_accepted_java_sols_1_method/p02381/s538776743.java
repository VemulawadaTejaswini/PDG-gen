import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int i, n;
        double a, b;

        while(sc.hasNext()){
            n = sc.nextInt();
            if(n==0)break;
            double[] s = new double[n];
            a = 0.0;
            b = 0.0;
            
            for(i=0;i<n;i++){
                s[i] = sc.nextInt();
                a += Math.pow(s[i], 2);
                b += s[i];
            }
            System.out.println(Math.sqrt((a/n)-(Math.pow(b/n,2))));
        }
    }
}
