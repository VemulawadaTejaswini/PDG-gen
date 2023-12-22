import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Integer> list = new ArrayList();
		for(int i=1; i<=5; i++) {
			list.add(Integer.parseInt(sc.next()));
		}
		int k = Integer.parseInt(sc.next());
		Collections.sort(list);
		Collections.reverse(list);
		for(Integer a:list) {
			if(a-list.get(4) > k) {
				System.out.println(":(");
				return;
			}
		}
		System.out.println("Yay!");
	}
}
