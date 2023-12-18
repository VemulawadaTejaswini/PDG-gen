import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
    BigInteger a = new BigInteger(st.nextToken());
    double b = Double.parseDouble(st.nextToken());
   // BigInteger c = new BigInteger(st.nextToken());
    //BigInteger d = a.multiply(c);
    //System.out.println(res);
    double res = a.doubleValue()*b;
    System.out.println((int)res);
    
    }
    
}
