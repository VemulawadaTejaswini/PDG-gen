import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<Integer> a_n = new ArrayList<Integer>();
		for(int i = 0; i < N ; i++) {
			int a_i = sc.nextInt();
			a_n.add(a_i);
		}
		int count = 0;
		for(int i = 1; i < N ; i++) {
			if(a_n.get(i-1) == a_n.get(i)) {
				a_n.set(i, 0);
				count++;
			}
		}
		System.out.println(count);
	}
}