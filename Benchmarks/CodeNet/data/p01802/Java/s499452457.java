import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	Scanner sc = new Scanner(System.in);
	public void run(){
		while(true){
			int d = sc.nextInt();
			int e = sc.nextInt();
			if(d == 0 && e == 0) break;
			calc(d, e);
		}
	}
	public void calc(int d, int e){
		double ans = Double.MAX_VALUE;
		for(int x = 0; x < d/2+1; x++){
			int y = d - x;
			double a = Math.abs(Math.sqrt(x*x + y*y) - e);
			if (a < ans) ans = a;
		}
		System.out.println(ans);
	}
	
	public static void main(String[] args){
		new Main().run();
	}
	
}