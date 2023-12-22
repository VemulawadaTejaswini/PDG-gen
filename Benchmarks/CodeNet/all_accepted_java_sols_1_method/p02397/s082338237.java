import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> x = new ArrayList<>();
		ArrayList<Integer> y = new ArrayList<>();
		for (int i = 0; i <= 10000; i++) {
			x.add(in.nextInt());
			y.add(in.nextInt());
			if (x.get(x.size() - 1) == 0 && y.get(y.size() - 1) == 0) {
				break;
			}
		}
		for (int i = 0; i < x.size(); i++) {
			if (x.get(i) == 0 && y.get(i) == 0) {
				break;
			}
			System.out.println(Math.min(x.get(i), y.get(i)) + " " + Math.max(x.get(i), y.get(i)));
		}
	}
}	
