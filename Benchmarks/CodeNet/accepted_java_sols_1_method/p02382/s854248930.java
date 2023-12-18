import java.util.Scanner;

public class Main{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int x[] = new int[100];
		int y[] = new int[100];
		int n = sc.nextInt();
		double p1 = 0.0;
		double p2 = 0.0;
		double p3 = 0.0;
		double pinf = 0.0;
		for(int i = 0; i < n; i++){
			x[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++){
			y[i] = sc.nextInt();
		}
		
		for(int i = 0; i < n; i++){
			p1 += (double)Math.abs(x[i] - y[i]);
		}
		
		for(int i = 0; i < n; i++){
			p2 += (double)Math.pow((double)Math.abs(x[i] - y[i]),2.0);
		}
		p2 = Math.sqrt(p2);
		
		for(int i = 0; i < n; i++){
			p3 += (double)Math.pow((double)Math.abs(x[i] - y[i]),3.0);
		}
		p3 = Math.pow(p3,1.0/3.0);
		
		for(int i = 0; i < n; i++){
			pinf = Math.max(pinf,(double)Math.abs(x[i] - y[i]));
		}
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(pinf);
	}
}