
import java.util.*;
import static java.lang.System.*;

class Main {
	public static Scanner sc = new Scanner(in);
	public static Random rand=new Random();


	public void run() {
		while(true){
			int n=sc.nextInt(),m=sc.nextInt(),p=sc.nextInt();
			if(n==0 && m==0 && p==0)return;
			int[] x=nextIntArray(n);

			int sum=0,winner=x[m-1];
			for(int i=0;i<n;i++){
				sum+=x[i];
			}

			ln(winner==0?0:sum*(100-p)/winner);
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