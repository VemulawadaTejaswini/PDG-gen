import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		Set<String> Ws = new LinkedHashSet<>();

		for (int i = 0; i < N; i++) {
			Ws.add(sc.next());
		}
		
		if (Ws.size() != N) {
			System.out.println("No");
			return;
		}
		
		Iterator<String> iteratorWs = Ws.iterator();
		
		String W = iteratorWs.next();
		
		String lastCha = W.substring(W.length() - 1);
			
		//System.out.println(lastCha);
		
		for (int i = 1; i < N; i++) {
			
			String tmp = iteratorWs.next();
			//System.out.println(tmp);
			
			if (!lastCha.equals(tmp.substring(0,1))) {
				System.out.println("No");
				return;
			}
			lastCha = tmp.substring(tmp.length() - 1);
			//System.out.println(lastCha);
			
			
		}
		
		System.out.println("Yes");
	}
}