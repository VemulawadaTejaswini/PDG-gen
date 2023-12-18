import java.util.*;

class Main {
	Scanner sc = new Scanner(System.in);

	public void run() {
		while(sc.hasNext()){
			double a=sc.nextDouble(),b=sc.nextDouble();
			double n=sc.nextDouble();
			double r=a/b;

			int sum=0;
			for(int i=0;i<n;i++){
				r*=10;
				sum+=(int)(r%10);
			}
			ln(sum);
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