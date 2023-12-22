import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		boolean ok = true;
		List<Integer> x = new ArrayList<>();
		List<Integer> y = new ArrayList<>();
		for(int i = 1; i <= N; i++) {
			int a = sc.nextInt();
			if(a != i) {
				x.add(i);
				y.add(a);
			}
		}
		if(x.size() > 2)
			ok = false;
		if(x.size() == 2)
			if(!y.contains(x.get(0)) || !y.contains(x.get(1)))
				ok = false;
		System.out.println(ok ? "YES" : "NO");

	}

}
