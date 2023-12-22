import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//AtCoder Beginner Contest 134
//C	Exception Handling
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<Integer> aList = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			aList.add(sc.nextInt());
		}
		sc.close();

		int max1 = 0;
		int max2 = 0;
		for (Integer a : aList) {
			
			if (max1 < a) {
				max1 = a;
			} else {
				if (max2 < a) {
					max2 = a;
				}
			}
		}

		for (Integer a : aList) {
			if (a == max1) {
				System.out.println(max2);
			} else {
				System.out.println(max1);
			}
		}
	}
}
