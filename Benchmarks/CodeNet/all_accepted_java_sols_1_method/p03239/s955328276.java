import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int T = sc.nextInt();

		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();

		for(int i = 0; i < N; i++) {


			list1.add(sc.nextInt());
			list2.add(sc.nextInt());

		}
		sc.close();

		List<Integer> TrueList = new ArrayList<Integer>();

		for(int i = 0; i < list1.size(); i++) {
			int b = list2.get(i);
			if(b <= T) {
				TrueList.add(list1.get(i));
			}
		}

		int min = -1;

		for(int i = 0; i < TrueList.size(); i++) {
				int a = TrueList.get(i);
			if(a < min || min == -1) {
				min = a;

			}
		}

		if(min != -1) {
			System.out.println(min);
		}else {
			System.out.println("TLE");
		}

	}

}