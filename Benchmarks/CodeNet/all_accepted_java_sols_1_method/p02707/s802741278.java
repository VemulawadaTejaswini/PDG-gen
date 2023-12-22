
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.next());

		List<Integer> list = new ArrayList();
		for(int i = 0; i < N;i++) {
			list.add(0);
		}

		for(int i = 1;i < N;i++) {
			int c = Integer.parseInt(sc.next()) -1;
			int a = list.get(c);
			list.set(c, ++a);
		}

		for(Integer b : list) {
			System.out.println(b);
		}


	}
}