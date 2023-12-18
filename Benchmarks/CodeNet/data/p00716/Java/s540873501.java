import java.util.*;
import java.awt.geom.*;
import java.io.*;

public class Main{
	int m, year;
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		int dataset = sc.nextInt();
		while(dataset-- > 0){
			m = sc.nextInt();
			year = sc.nextInt();
			int n = sc.nextInt();
			int max = 0;
			while(n-- > 0){
				int digit = sc.nextInt();
				double r = sc.nextDouble();
				int t = sc.nextInt();
				int res = solve(digit, r, t);
				max = Math.max(max, res);
			}
			System.out.println(max);
		}
	}

	private int solve(int digit, double r, int t) {
		int a = m;
		if(digit == 1){
			for(int i = 0; i < year; i++){
				int b = (int) (a * r);
				a = a + b - t;
			}
		}
		else{
			int b = 0;
			for(int i = 0; i < year; i++){
				b += (int) (a * r);
				a -= t;
			}
			a = a + b;
		}
		return a;
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}