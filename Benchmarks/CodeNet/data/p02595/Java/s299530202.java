import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int ans = 0;
		int n = scanner.nextInt();
		double d = scanner.nextInt();
		List<Integer> x_y = new ArrayList<>();
		List<List<Integer>> x_y_set = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			x_y.add(scanner.nextInt());
			x_y.add(scanner.nextInt());
			x_y_set.add(new ArrayList<>(x_y));
			x_y.clear();
		}
		double distance =0;
		for (int i = 0; i < n; i++) {
			distance = Math.sqrt(Math.pow(x_y_set.get(i).get(0),2)
									+ Math.pow(x_y_set.get(i).get(1),2));
			if(distance <= d) {
				ans+=1;
			}

		}
		System.out.println(ans);
		scanner.close();
	}
}