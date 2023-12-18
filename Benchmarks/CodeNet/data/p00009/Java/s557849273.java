import java.util.*;


public class Main {
	
	void AOJ0009(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			ArrayList<Integer> prime = Sieve(sc.nextInt());
			System.out.println(prime.size());
			for(int i=0; i<prime.size(); i++){
				System.out.println(prime.get(i));
			}
		}
	}
	
	ArrayList<Integer> Sieve(int n){
	     ArrayList<Integer> prime = new ArrayList<Integer>();
	     if(n<2)	return prime;
	     boolean[] list = new boolean[n];
	     Arrays.fill(list, true);
	     list[1]=false;
	     for (int i=2; i<n; i++) {
	          if (list[i]) {
	               prime.add(i);
	               for (int j=i+i; j<n; j+=i)	list[j] = false;
	          }
	     }
	     return prime;
	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Main().AOJ0009();
	}

}