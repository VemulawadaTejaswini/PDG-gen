
import java.util.*;

import static java.lang.System.*;

class Main {
	public static Scanner sc = new Scanner(in);
	public static Random rand=new Random();

	public void run() {
		while(true){
			int n=sc.nextInt(),m=sc.nextInt();
			if(n==0 && m==0)
				break;

			int[] t=nextIntArray(n);
			int[] h=nextIntArray(m);
			Arrays.sort(t);
			Arrays.sort(h);
			int tsum=0,hsum=0;
			for(int val:t){
				tsum+=val;
			}
			for(int val:h){
				hsum+=val;
			}
			if((hsum+tsum)%2==1){
				ln(-1);continue;
			}
			int tval=-1,sval=-1,min=10000000;
			for(int i=0;i<n;i++){
				int send=t[i];
				int get=(hsum-tsum)/2+t[i];
				if(Arrays.binarySearch(h,get)>=0){
					if(send+get<min){
						min=send+get;
						tval=send;sval=get;
					}
				}
			}
			if(tval==-1)ln(-1);
			else ln(tval+" "+sval);
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