import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		TreeMap <Long, Integer> store = new TreeMap <Long, Integer>();
		long Ai=0;
		
		for (int i = 0; i<N; i++){
			Ai = sc.nextLong();
 
			if (store.containsKey(Ai)) 
				store.put(Ai, store.get(Ai) + 1);
			else 
				store.put(Ai, 1);
		}
		long a=0;
		long b=0;
		
		
		int freq=0;
		
		while (store.isEmpty()!=true){
			a = store.lastKey();
			freq = store.get(a);
			store.pollLastEntry();
			if (freq>1)
				break;	
		}
		
		if (freq>3)
			System.out.println(a*a);
		
		else {
			while (store.isEmpty()!=true){
				b = store.lastKey();
				freq = store.get(b);
				store.pollLastEntry();
				if (freq>1)
					break;
				
			}
			if (freq>1)
				System.out.println(a*b);
			else
				System.out.println(0);
		}
		
	
		
		sc.close();
	}

}
