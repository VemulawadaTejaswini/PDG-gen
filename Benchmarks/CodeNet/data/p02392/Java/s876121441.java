import java.util.Scanner;

class Main {
	Scanner sc=new Scanner(System.in);

	public void run() {
		int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
		ln((a<b && b<c)?"Yes":"No");
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