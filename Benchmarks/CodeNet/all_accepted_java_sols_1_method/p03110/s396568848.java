
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		double tot=0;
		for(int i=0;i<n;i++) {
			double x=scn.nextDouble();
			String str=scn.next();
			if(str.startsWith("BTC")) {
				tot+=x*380000.0;
			}else {
				tot+=x;
			}
		}
		System.out.println(tot);
	}

}
