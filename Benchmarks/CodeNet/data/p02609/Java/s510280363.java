

import java.math.BigInteger;
import java.util.Scanner;



public class Main {
    BigInteger ONE = new BigInteger("1");
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next(), tmp;
        for(int i = 0; i < n; i++){
            tmp = "";
            int ones = 0;
            for(int j = 0; j < n; j++){
                if(i != j) tmp += s.charAt(j);
                else{
                    if(s.charAt(j) == '0') tmp += '1';
                    else tmp += '0';
                }
            }
            BigInteger b = new BigInteger(tmp);
            BigInteger dec = new BigInteger(tmp, 2);
            
            int c = 0;
            if(dec.compareTo(BigInteger.ZERO) == 1){
                String x = b.toString();
                ones = 0;
                for(int j = 0; j < x.length(); j++)
                    if(x.charAt(j) == '1') ones++;
                c++;
                dec = dec.remainder(new BigInteger(String.valueOf(ones)));
                b = new BigInteger(dec.toString(2));
            }
            int x = Integer.valueOf(dec.toString());
            String bin = b.toString();
            while(x > 0){
                c++;
                ones = 0;
                for(int j = 0; j < bin.length(); j++)
                    if(bin.charAt(j) == '1') ones ++;
                x %= ones;
                bin = Integer.toBinaryString(x);
            }
            System.out.println(c);
        }   
    }
}
