
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> arr = new ArrayList<>();
		for (; sc.hasNext();) {
			arr.add(sc.nextInt());
		}
		int count = 0;
		int min = arr.get(0);
		for (int num : arr) {
			if (num <= min) {
				count++;
				min = num;
			}
		}
		System.out.println(count);
	}

}
