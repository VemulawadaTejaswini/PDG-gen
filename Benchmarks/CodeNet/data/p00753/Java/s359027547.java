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
    	Set<Integer> pmap=new HashSet<Integer>(getPrimeList(123456*2));

        Test:while(true){
        	int n=sc.nextInt();
        	if(n==0)return;
        	int res=0;
        	for(int i=n+1;i<=2*n;i++){
        		if(pmap.contains(i)){
        			res++;
        		}
        	}
        	ln(res);
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