import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int people = sc.nextInt();
		int height = sc.nextInt();
		List<Integer> heights = new ArrayList<>();

		for(int i = 0;i < people;i++) {
			heights.add(sc.nextInt());
		}

		int count = 0;
		for (Integer h : heights) {
			if(h >= height)
				count++;
		}

		System.out.println(count);
	}
}
