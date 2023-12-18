import java.util.*;
import java.math.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int count;
	static BigInteger sum = new BigInteger("0");
	static BigInteger numSum = new BigInteger("0");
	static BigInteger val, num;
	public static void main(String[] args) {
		while(read()){
			
		}
		solve();
	}
	static boolean read(){
		if(!sc.hasNext())return false;
		String line;
		String[]dev = new String[2];
		line = sc.next();
		dev = line.split(",");
		val = BigInteger.valueOf(Integer.parseInt(dev[0]));
		num = BigInteger.valueOf(Integer.parseInt(dev[1]));
		//System.out.println("num = " + num);
		sum = sum.add(val.multiply(num));
		numSum = numSum.add(num);
		//System.out.println("numSum = " + numSum);
		count++;
		//System.out.println("count = " + count);
		return true;
	}
	static void solve(){
		System.out.println(sum);
		int intnum = numSum.intValue();
		System.out.println(Math.round((double)intnum/count));
	}

}