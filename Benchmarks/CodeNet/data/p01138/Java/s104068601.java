
import java.util.*;
import static java.lang.System.*;

class Main {
	public static Scanner sc = new Scanner(in);
	public static Random rand=new Random();

	public int parse(String str){
		String[] l=str.split(":");
		return Integer.parseInt(l[0])*3600+Integer.parseInt(l[1])*60+Integer.parseInt(l[2]);
	}

	public void run() {
		while(true){
			int n=sc.nextInt();
			if(n==0)return;
			int[] imos=new int[3600*24];
			while(n--!=0){
				int from=parse(sc.next());
				int to=parse(sc.next());
				imos[from]++;
				imos[to]--;
			}
			int max=0;
			int now=0;
			for(int i=0;i<imos.length;i++){
				now+=imos[i];
				max=Math.max(now,max);
			}
			ln(max);

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