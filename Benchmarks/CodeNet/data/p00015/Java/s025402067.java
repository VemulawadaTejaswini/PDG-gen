import java.util.Scanner;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		String numstr = "";
		for(int i = 0; i < 79; i++){
			numstr += "9";
		}
		int n;
		BigInteger a,b,c;
		BigInteger max = new BigInteger(numstr); //numstr : 9999 ... 999
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for(int i = 0; i < n; i++){
			a = sc.nextBigInteger();
			b = sc.nextBigInteger();
			c = a.add(b);
			if(c.compareTo(max) > 0){
				System.out.println("overflow");
			}else{
				System.out.println(c.toString());
			}
		}
	}
}