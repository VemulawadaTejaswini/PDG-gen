
import java.util.Arrays;
import java.util.Scanner;

class Main {
	Scanner sc = new Scanner(System.in);

	public void run() {
		int[] data=new int[10];
		for(int i=0;i<10;i++){
			data[i]=sc.nextInt();
		}
		Arrays.sort(data);
		for(int i=0;i<3;i++){
			ln(data[i]);
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