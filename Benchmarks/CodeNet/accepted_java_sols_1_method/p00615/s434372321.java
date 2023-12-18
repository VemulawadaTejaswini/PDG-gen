import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, m;
		List<Integer> array = new ArrayList<Integer>(20000);
		
		n = sc.nextInt();
		m = sc.nextInt();
		
		while(!(n == 0 && m == 0)) {
			array.clear();
			for(int i = 0; i < n + m; i++) {
				array.add(sc.nextInt());
			}
			Collections.sort(array, Comparator.naturalOrder());
			
			int interval = 0;
			int nt = 0;
			
			for(int time : array) {
				if (time - nt > interval) {
					interval = time - nt;
				}
				nt = time;
			}
				
			System.out.println(interval);

			n = sc.nextInt();
			m = sc.nextInt();
		}
		
	}
}