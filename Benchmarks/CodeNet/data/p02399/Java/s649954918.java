import java.util.Scanner;

class Main {
	Scanner sc = new Scanner(System.in);

	public void run() {

		while (true) {
			int a=sc.nextInt(),b= sc.nextInt();
			
			ln(a/b+" "+ a%b+" " + (double)a/b);
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