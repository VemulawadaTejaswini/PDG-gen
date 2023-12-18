package p1147;
import java.util.*;

import static java.lang.System.*;

class Main {
	public static Scanner sc = new Scanner(in);
	public static Random rand=new Random();

	public void run() {
		while(true){
			int n=sc.nextInt();
			if(n==0)break;

			int[] a=nextIntArray(n);
			Arrays.sort(a);
			int sum=0;
			for(int i=1;i<n-1;i++){
				sum+=a[i];
			}
			ln(sum/(n-2));
		}
	}
	public static void main(String[] args) {
		new Main().run();
	}

	public int[] nextIntArray(int n){
		int[] res=new int[n];
		for(int i=0;i<n;i++){
			res[i]=sc.nextInt();
		}
		return res;
	}
	public static void pr(Object o) {
		out.print(o);
	}
	public static void ln(Object o) {
		out.println(o);
	}
	public static void ln() {
		out.println();
	}
}