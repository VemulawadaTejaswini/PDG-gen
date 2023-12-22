import java.math.BigInteger;
import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		BigInteger a = new BigInteger(sc.next());
		a = a.subtract(BigInteger.ONE);
		BigInteger b = new BigInteger(sc.next());
		BigInteger c = new BigInteger(sc.next());
		BigInteger d = new BigInteger(sc.next());

		BigInteger ans = b.subtract(a);

		BigInteger val = b.divide(c).subtract(a.divide(c));
		ans = ans.subtract(val);

		val = b.divide(d).subtract(a.divide(d));
		ans = ans.subtract(val);

		BigInteger divisor = c.multiply(d).divide(Divisor.gcd(c, d));
		val = b.divide(divisor).subtract(a.divide(divisor));
		ans = ans.add(val);

		System.out.println(ans);
	}
}



class Divisor{
    public static BigInteger gcd(BigInteger a, BigInteger b){
        if(b.equals(BigInteger.ZERO))return a;
        return gcd(b, a.remainder(b));
    }

    static BigInteger x, y;
    public static BigInteger extGcd(BigInteger a, BigInteger b){
        if(b.equals(BigInteger.ZERO)){
            x = BigInteger.ONE;
            y = BigInteger.ZERO;
            return a;
        }
        BigInteger ans = extGcd(b, a.remainder(b));
        BigInteger tmp = y;
        y = x;
        x = tmp;
        y = y.subtract(a.divide(b).multiply(x));
        return ans;
    }
}