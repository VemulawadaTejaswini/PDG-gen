import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, Boolean> m = new HashMap<Integer, Boolean>();
		int N;
		// GET INPUT
		N = sc.nextInt();
		for(int i=0; i<N; i++) {
			int A = sc.nextInt();
			if(m.containsKey(A)) {
				if(m.get(A)) {
					m.put(A, false);
				} else {
					m.put(A, true);
				}
			} else {
				m.put(A, true);
			}
		}
		
		
		
		// GET INPUT END
		
		sc.close();
		
		int ans = 0;
		for(Map.Entry<Integer, Boolean> entry : m.entrySet()) {
			if(entry.getValue()) {
				ans++;
			}
		}
		System.out.println(ans);
		
		


	}

}
