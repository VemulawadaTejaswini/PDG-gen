
import java.util.*;
import static java.lang.System.*;

class Main {
	public static Scanner sc = new Scanner(in);
	public static Random rand=new Random();

	public int  josephus(int n, int k, int s) {//はじめにk
		 long x = k * s;
		 while (x > n) x = ((x - n) * k - 1) / (k - 1);
		 return (int)x;
	}


	public void run() {
		while(true){
			int n=sc.nextInt(),k=sc.nextInt(),m=sc.nextInt();
			if(n==0)return;
			int j=(josephus(n,k,n)-k+m)%n;
			if(j<0)j+=n;
			ln(j);
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