import java.util.*;
import java.math.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System .in);
        int n = sc.nextInt();
        BigInteger biginteger1, biginteger2, result; 
        biginteger1 = new BigInteger("10"); 
        biginteger2 = new BigInteger("1000000007"); 
        BigInteger exponent = new BigInteger(Integer.toString(n-2)); 
        BigInteger nn = new BigInteger(Integer.toString(n));
        BigInteger nnn = new BigInteger(Integer.toString(n-1));
        result = biginteger1.modPow(exponent, biginteger2);
        nn = (nnn.multiply(nn)).mod(biginteger2);
        result = (nn.multiply(result)).mod(biginteger2);
        result = result.mod(biginteger2);
        System.out.println(result);
    }
    }
    