import java.util.*;
import java.math.BigInteger;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		BigInteger low = BigInteger.ZERO;
		BigInteger up = new BigInteger("9999");

		while(sc.hasNext()){
			String s = sc.next();
			for(int i=s.length()-1;i>=0;i--){
				if(!Character.isDigit(s.charAt(i)) && (i-1<0 || !Character.isDigit(s.charAt(i-1)))){
					s = s.substring(0,i) + "0" + s.substring(i);
				}
			}

			String[] val = s.split("\\+|-|\\*|=");
			String[] op = s.split("[0-9]+");

			BigInteger cal = new BigInteger(val[0]);
			boolean flg = cal.compareTo(up) <= 0 && cal.compareTo(low) >= 0;

			for(int i=1;flg && i<val.length;i++){
				BigInteger next = new BigInteger(val[i]);
				flg = next.compareTo(up) <= 0 && next.compareTo(low) >= 0;
				if(!flg) break;

				if(op[i].equals("+")) cal = cal.add(next);
				else if(op[i].equals("-")) cal = cal.subtract(next);
				else cal = cal.multiply(next);

				flg = cal.compareTo(up) <= 0 && cal.compareTo(low) >= 0;
			}

			System.out.println(flg ? cal : "E");
		}
	}
}