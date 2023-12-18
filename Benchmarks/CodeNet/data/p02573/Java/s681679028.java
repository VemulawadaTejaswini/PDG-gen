import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}

	int n;
	int m;

	public void run() {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		m = sc.nextInt();

		List<List<Integer>> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			ArrayList<Integer> e = new ArrayList<>();
			e.add(i-1);
			list.add(e);
		}

		for (int i = 0; i < m; i++) {
			int a = sc.nextInt()-1;
			int b = sc.nextInt()-1;
			
			list.get(a).add(b);
			list.get(b).add(a);
		}
		
		int max = 1;
		for (int i = 0; i < n; i++) {
			if( max < list.get(i).size() ) {
				max = list.get(i).size();
			}
		}
		System.out.println(max);

	}
}