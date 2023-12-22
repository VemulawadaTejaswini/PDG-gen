import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		ArrayList<Integer> array = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			array.add(Integer.parseInt(sc.next()));
		}
		Integer[] list = array.toArray(new Integer[array.size()]);

		System.out.println(threeOrTwo(n, list));
		sc.close();
	}

	public static int threeOrTwo(int n, Integer list[]) {
		int count = 0;
		while (true) {
			int even = 0;
			for (int i = 0; i < n; i++) {
				if (list[i] % 2 == 0) {
					list[i] = list[i] / 2;
					even++;
					break;
				} 
			}
			if (even ==  0) {
				return count;
			} else {
				count++;
			}
		}
	}
}