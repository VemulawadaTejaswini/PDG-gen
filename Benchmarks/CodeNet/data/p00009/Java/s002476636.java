
import java.util.*;

class Main {
	Scanner sc = new Scanner(System.in);

	public void run() {
		while(sc.hasNext()){
			int n=sc.nextInt();
			List<Integer> primes=new ArrayList<Integer>();
			
			for(int i=2;i<=n;i++){
				boolean isprime=true;
				for(int prime:primes){
					if(i%prime==0){
						isprime=false;
						break;
					}
				}
				if(isprime){
					primes.add(i);
				}
			}
			ln(primes.size());
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	public static void pr(Object o) {
		System.out.print(o);
	}

	public static void ln(Object o) {
		System.out.println(o);
	}

	public static void ln() {
		System.out.println();
	}
}