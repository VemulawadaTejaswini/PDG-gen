import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> x = new ArrayList<>();
		for (int i = 1; i <= 10000; i++) {
			x.add(in.nextInt());
			if (x.get(x.size() - 1) == 0) {
				break;
			}
		}
		
		for (int i = 1; i <= 10000; i++) {
			if (x.get(i - 1) == 0) {
				break;
			}
			System.out.println("Case " + i + ": " + x.get(i - 1) );
		}
	}
}	
