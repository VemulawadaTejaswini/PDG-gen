
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.StringTokenizer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Varun
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
    StringTokenizer st = new StringTokenizer(br.readLine());
   // BigInteger a = new BigInteger(st.nextToken());
     final BigDecimal a = new BigDecimal( st.nextToken() );
    final BigDecimal orig = new BigDecimal( st.nextToken() );
    //BigInteger c = new BigInteger(String.valueOf(b));
    //BigInteger d = a.multiply(c);
    //System.out.println(orig);
   BigDecimal res = a.multiply(orig);
   System.out.println(res.toBigInteger().longValueExact());
   
   // System.out.printf("%.f",res);
    
    }
    
}
