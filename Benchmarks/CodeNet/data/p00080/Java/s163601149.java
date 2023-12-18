import java.util.*;

class Main {
	Scanner sc = new Scanner(System.in);

	public void run() {
		while(true){
			double q=sc.nextDouble();
			if(q==-1)break;
			double x=Math.abs(q/2);
			while(Math.abs(x*x*x-q)>=0.000001*q){
				x=x-(x*x*x-q)/(3*x*x);
			}
			ln(String.format("%.6f",x));
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	public static void pr(Object o) {
		System.out.print(o);
	}

	public static void ln(Object o) {
		System.out.println(o);
	}

	public static void ln() {
		System.out.println();
	}
}