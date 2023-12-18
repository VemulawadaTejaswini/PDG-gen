import java.util.*;
 
public class Main {
 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sum = 0;
		List<Integer> point = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			int p = sc.nextInt();
			sum += p;
			if (p%10 != 0) {
				point.add(p);
			}
		}
		if (point.size() == 0) {
			System.out.println(0);
		} else {
			Collections.sort(point);
			System.out.println(sum%10 == 0 ? sum - point.get(0) : sum);
		}
	}
}