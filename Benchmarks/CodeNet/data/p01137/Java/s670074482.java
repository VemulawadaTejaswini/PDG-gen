import java.util.*;
import static java.lang.System.*;

class Main {
	public static Scanner sc = new Scanner(in);
	public static Random rand=new Random();

	public void run() {
		while(true){
			int e=sc.nextInt();
			if(e==0)return;

			int min=Integer.MAX_VALUE;
			for(int z=0;z*z*z<=e;z++)
				for(int y=0;y*y<=e;y++){
				int x=e-y*y-z*z*z;
				if(x>=0)
					min=Math.min(min,x+y+z);
			}
			ln(min);
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