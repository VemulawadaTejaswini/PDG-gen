import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	static int a,b,n;
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		for(;cin.hasNext();){
			a=cin.nextInt();
			b=cin.nextInt();
			n=cin.nextInt();
			BigDecimal bd = new BigDecimal((double)a/(double)b);
			int ans=0;
			for(int i = 0;i<n;i++){
				bd=bd.multiply(new BigDecimal("10"));
				int a = bd.intValue();
				ans+=a%10;
			}
			System.out.println(ans);
		}

	}

}