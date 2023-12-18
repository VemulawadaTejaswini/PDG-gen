import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		double[] ca = new double[] {35.5,37.5,40,43,50,55,70};
		double[] cb = new double[] {71,77,83,89,105,116,148};
		String[] c  = new String[] {"AAA","AA","A","B","C","D","E","NA"};
		while(stdIn.hasNext()) {
			double a = stdIn.nextDouble();
			double b = stdIn.nextDouble();
			
			int ar = 100;
			int br = 100;
			for(int i = 0; i < ca.length; i++) {
				if(ca[i] > a) {
					ar = i;
					break;
				}
			}
			for(int i = 0; i < cb.length; i++) {
				if(cb[i] > b) {
					br = i;
					break;
				}
			}
			
			int ans = Math.max(ar, br);
			if(ans == 100) {
				ans = c.length-1;
			}
			
			System.out.println(c[ans]);
			
			
			
			
		}
	}
}