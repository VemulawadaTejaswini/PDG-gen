import java.util.*;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> values = new ArrayList<Integer>();
		for(int tmp = 0; tmp < n; tmp++) {
			int v = sc.nextInt();
			values.add(v);
		}
		List<Integer> costs = new ArrayList<Integer>();
		for(int tmp = 0; tmp < n; tmp++) {
			int c = sc.nextInt();
			costs.add(c);
		}
		int result = 0;
		
		for(int tmp = 0; tmp < n ; tmp++) {
			int diff = values.get(tmp) - costs.get(tmp);
			if((diff) >= 0) {
				result  += diff;
			}
		}
		System.out.println(result);	
	}
}