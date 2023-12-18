import java.util.*;
import java.math.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		BigInteger million = new BigInteger("1000000");

		while(true){
			int n = sc.nextInt();
			if(n == 0) break;

			boolean naflg = true;
			for(int i=0;i<n;i++){
				String no = sc.next();
				BigInteger mul = sc.nextBigInteger().multiply(sc.nextBigInteger());
				if(mul.compareTo(million) >= 0){
					System.out.println(no);
					naflg = false;
				}
			}

			if(naflg) System.out.println("NA");
		}
	}
}