import java.util.Scanner;
import java.math.BigDecimal;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner kb=new Scanner(System.in);
		BigDecimal m=new BigDecimal(kb.nextLong());
		long n=kb.nextLong();
		BigDecimal s=new BigDecimal(1);
		BigDecimal l=new BigDecimal(1000000007);
		for(long i=0;i<n;i++){
			s=s.multiply(m);
		}
		s=s.remainder(l);
		System.out.println(s);
	}

}