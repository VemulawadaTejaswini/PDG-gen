import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		
		int[] x = new int[n];
		int[] y = new int[n];
		for(int i=0; i < n;i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		
		int count=0;
		double dis = 0;
		
		for(int i=0; i < n; i++) {
			dis = Math.sqrt((long)x[i]*x[i] + (long)y[i]*y[i]);
			if(dis <= d) {
				count++;
			}
		}
		
		System.out.println(count);
		
	}

}
