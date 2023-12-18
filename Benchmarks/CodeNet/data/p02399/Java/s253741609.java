/*AOJ-ITP-4-1*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
 
public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
 
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st[] = br.readLine().split(" ");
        int count = 0;
        double a = Integer.parseInt(st[0]);
        double b = Integer.parseInt(st[1]);
        
        if(!(a >= 1 && b >= 1 && a <= 10e9 && b <= 10e9)){System.exit(1);}
        
        int d = (int)(a / b);
        int r = (int)(a % b);
        double f = (a / b);
        BigDecimal x = new BigDecimal(f);
        x = x.setScale(5, BigDecimal.ROUND_HALF_UP);
        System.out.print(d + " " + r + " " );
        System.out.printf("%.5f",x);
        System.out.println();
    }
}