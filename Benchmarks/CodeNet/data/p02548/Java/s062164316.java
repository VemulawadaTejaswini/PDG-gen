import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] $) {
		new Main().run();
	}
	
	void run() {
		Scanner sc=new Scanner(System.in);
		long N=sc.nextLong();
		long ans=0;
		for (long a=1;a<N;++a) {
			long b=N/a;
			if (a*b==N) --b;
			ans+=b;
		}
		System.out.println(ans);
	}
	
	void tr(Object...objects) {System.out.println(Arrays.deepToString(objects));}
}
