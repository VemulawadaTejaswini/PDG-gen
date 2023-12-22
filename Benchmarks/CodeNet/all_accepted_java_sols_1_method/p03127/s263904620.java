import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		TreeMap <Integer, Integer> T = new TreeMap <Integer, Integer>();
		
		for (int i=0; i<N; i++){
			T.put(sc.nextInt(), 0);
		}
	
		if (T.size()!=1){
		while (T.size()>1 && T.containsKey(1)!=true){
			
			int first = T.firstKey();
			
			int second = T.lastKey();
			T.remove(second,T.get(second));
			
				
			if (second%first!=0) {
				T.put(second%first, 0);
			}
			
		}
		}
		System.out.println(T.firstKey());
		

	}

}
