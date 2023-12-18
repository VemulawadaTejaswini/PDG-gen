import java.util.*;

class Main {
	Scanner sc = new Scanner(System.in);


	public void run() {
		while(true){
			int x=sc.nextInt(),h=sc.nextInt();
			if(x==0 && h==0)break;
			ln(x*(x+Math.sqrt(x*x+4*h*h)));
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