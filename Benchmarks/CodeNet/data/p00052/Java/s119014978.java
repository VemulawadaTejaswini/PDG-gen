import java.util.*;

//文字操作
class Main {
	Scanner sc = new Scanner(System.in);

	public void run() {
		while(true){
			int n=sc.nextInt();
			if(n==0)break;

			int c=0;
			for(int i=5;i<=n;i*=5){
				c+=n/i;
			}
			ln(c);
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