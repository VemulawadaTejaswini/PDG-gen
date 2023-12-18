import java.util.*;

class Main {
	Scanner sc = new Scanner(System.in);

	public void run() {
		int x1=sc.nextInt();
		int y1=sc.nextInt();
		int x2=sc.nextInt();
		int y2=sc.nextInt();
		int x3=sc.nextInt();
		int y3=sc.nextInt();
		int x4=sc.nextInt();
		int y4=sc.nextInt();
		int dx1=x1-x2;
		int dy1=y1-y2;
		int dx2=x3-x4;
		int dy2=y3-y4;
		ln((dx1*dy2==dx2*dy1)?"YES":"NO");
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