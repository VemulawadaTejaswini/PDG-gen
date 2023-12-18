
import java.util.*;
import static java.lang.System.*;

class Main {
	public static Scanner sc = new Scanner(in);
	public static Random rand=new Random();


	public void run() {
		TCase:while(true){
			int n=sc.nextInt(),q=sc.nextInt();
			if(n==0)return;
			int[][] ds=new int[n][];
			for(int i=0;i<n;i++){
				int k=sc.nextInt();
				ds[i]=new int[k];
				for(int j=0;j<k;j++)
					ds[i][j]=sc.nextInt();
			}

			int max=0,ind=-1;
			for(int d=1;d<=100;d++){
				int num=0;
				for(int j=0;j<n;j++){
					if(Arrays.binarySearch(ds[j],d)>=0)num++;
				}
				if(num>max && num>=q){
					max=num;
					ind=d;
				}
			}

			if(ind>=0)ln(ind);
			else ln(0);
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