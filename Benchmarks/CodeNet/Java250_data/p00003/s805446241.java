
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Main {
	Scanner sc = new Scanner(System.in);

	public void run() {
		int N=sc.nextInt();
		
		while(N--!=0){
			int[] edge=new int[]{
					sc.nextInt(),sc.nextInt(),sc.nextInt()
			};
			Arrays.sort(edge);
			ln((edge[2]*edge[2]==edge[0]*edge[0]+edge[1]*edge[1])?"YES":"NO");
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