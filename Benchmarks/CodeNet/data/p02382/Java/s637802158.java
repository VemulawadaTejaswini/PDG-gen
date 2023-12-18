import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x[] = new int[n];
		int y[] = new int[n];
		int x_y[] = new int[n];
		int i;
		double p=0,p1=0,p2=0,p3=0,pinf=0;
		for(i=0; i<n; i++){
			x[i] = sc.nextInt();
		}
		for(i=0; i<n; i++){
			y[i] = sc.nextInt();
		}
		for(i=0; i<n; i++){
			p = Math.abs(x[i]-y[i]);
			p1 += p;
			p2 += Math.pow(p, 2);
			p3 += Math.pow(p, 3);
			if(pinf < p) pinf = p;
		}
		System.out.println(p1);
		System.out.println(Math.sqrt(p2));
		System.out.println(Math.cbrt(p3));
		System.out.println(pinf);
	}
}