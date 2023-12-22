import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int l;
		int count = 0;

		List<Integer> list = new ArrayList<>();

		for(int i = 0; i < n; i++) {
			l = sc.nextInt();
			list.add(l);
		}

		for(int i = 0; i < list.size() - 2; i++) {

			for(int j = i + 1; j < list.size() - 1; j++) {

				for(int k = j + 1; k < list.size(); k++) {
					int a = list.get(i);
					int b = list.get(j);
					int c = list.get(k);

					if(a != b && b != c && c != a) {
						if(a + b > c && b + c > a && c + a > b) {
							count++;
						}
					}


				}

			}

		}

		System.out.println(count);

	}

}