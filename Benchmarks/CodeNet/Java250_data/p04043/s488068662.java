import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String[] args) throws Exception {
		new Main().run();
	}
	
	void run() {
		Scanner sc=new Scanner(System.in);
		int[] a=new int[3];
		for(int i=0;i<3;++i)a[i]=sc.nextInt();
		Arrays.sort(a);
		System.out.println(a[0]==5&&a[1]==5&&a[2]==7?"YES":"NO");
	}
	
	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
	
}
