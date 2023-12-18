
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int t = sc.nextInt();
		int x,y=0,time=0;
		
		x = sc.nextInt();
		y=x;
		time += x-m;
		for(int i=1;i<n;i++) {
			y = sc.nextInt();
			
			time += 2*m >= y-x ? 0:y-x-2*m;
			
			x=y;
		}
		
		time += y+m < t ? t-y-m : 0;
		System.out.println(time);
	sc.close();
	}

}

