import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> heights = new ArrayList<Integer>();
		for (int i = 0 ; i < 10 ; i++) {
			heights.add(sc.nextInt());
		}
		Collections.sort(heights);
		Collections.reverse(heights);
		for (int i = 0 ; i < 3 ; i++) {
			System.out.println(heights.get(i));
		}
	}
}