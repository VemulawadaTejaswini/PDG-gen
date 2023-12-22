import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int X = scan.nextInt();

		List<Integer> list = new ArrayList<>();
		list.add(0);

		for(int i = 0; i < N; i++) {
			list.add(scan.nextInt());
		}

		List<Integer> points = new ArrayList<>();

		int val = 0;
		for(int i = 0; i < N + 1; i++) {

			val += list.get(i);
			points.add(val);
		}
		
		int count  = 0;
		for(int i = 0; i < points.size(); i++) {
			if(points.get(i) <= X) {
				count++;
			}
		}
		System.out.println(count);
	}
}