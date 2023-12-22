import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger sum = BigInteger.valueOf(0); 
		while(sc.hasNext()) {
			String str = sc.next();
			String [] a = str.split("[^0-9]");   //String [] a = str.split("[D]");だと上手くいかなかった 
			for(int i=0;i<a.length;i++) {
				if(a[i].length()>0) {
				       BigInteger b = new BigInteger(a[i]);  
                                       sum = sum.add(b);
				}
			}
		}
		System.out.println(sum.toString());
	}
}
