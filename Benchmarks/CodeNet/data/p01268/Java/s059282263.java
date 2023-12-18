
import java.util.*;

import static java.lang.System.*;

class Main {
	public static Scanner sc = new Scanner(in);
	public static Random rand=new Random();

	public List<Integer> getPrimeList(int max){
		LinkedList<Integer> primes=new LinkedList<Integer>();

		PLoop:for(int i=2;i<max;i++){
			for(int prime:primes){
				if(i%prime==0){
					continue PLoop;
				}
				if( prime*prime>i){
					break;
				}
			}
			primes.add(i);
		}
		return primes;
	}
	public void run() {
		List<Integer> plist=new ArrayList<Integer>(getPrimeList(200000));

		TCase:while(true){
			int n=sc.nextInt(),p=sc.nextInt();
			if(n==-1)return;

			int ind=Collections.binarySearch(plist,n+1);
			if(ind<0)ind=~ind;

			List<Integer> sumset=new LinkedList<Integer>();
			for(int i=ind;i<=ind+p;i++)for(int j=i;j<=ind+p;j++){
				sumset.add(plist.get(i)+plist.get(j));
			}
			Collections.sort(sumset);

			ln(sumset.get(p-1));
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