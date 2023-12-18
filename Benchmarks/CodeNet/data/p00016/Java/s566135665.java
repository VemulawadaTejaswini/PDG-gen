import java.util.*;
public class Main {
	public static int[] val;
	public static int n;
	public static int x;
	public static boolean[] dp;
	public static int[] PrimeTable;
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		double nowx = 0.0;
		double nowy = 0.0;
		double nowa = 90.0;
		
		while(true) {
			String tmp = stdIn.next();
			String[] tmp2 = tmp.split(",");
			int a = Integer.parseInt(tmp2[0], 10);
			int b = Integer.parseInt(tmp2[1], 10);
		
			
			if(a == 0 & b == 0) {
				break;
			}
			
			double px = a * Math.cos(Math.toRadians(nowa));
			double py = a * Math.sin(Math.toRadians(nowa));
			
			nowx += px;
			nowy += py;
			
			nowa += b;
			
			if(nowa >= 360) {
				nowa -= 360;
			}
			if(nowa < 0) {
				nowa += 360;
			}
			
		}
		
		int ansx = (int)nowx;
		int ansy = (int)nowy;
		
		System.out.println(-ansx);
		System.out.println(ansy);
	}

}