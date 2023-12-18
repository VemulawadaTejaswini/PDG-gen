import java.util.*;

import static java.lang.System.*;

class Main {
	public static Scanner sc = new Scanner(in);
	public static Random rand=new Random();

	public void run() {


		while(true){
			int n=sc.nextInt(),r=sc.nextInt();
			if(n==0 && r==0)return;
			int[] ca=new int[n];
			for(int i=0;i<n;i++){
				ca[i]=n-i;
			}

			while(r--!=0){
				int[] cp=Arrays.copyOf(ca,n);
				int p=sc.nextInt()-1,c=sc.nextInt();
				for(int i=0;i<c;i++){
					ca[i]=cp[p+i];
				}
				for(int i=0;i<p;i++){
					ca[i+c]=cp[i];
				}
			}
			ln(ca[0]);
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