import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (sc.hasNextLine()) {
			int[] road = new int[10];
			int sum = 0;
			String[] str = sc.nextLine().split(",");
			for (int i = 0; i < road.length; i++) {
				road[i] = Integer.parseInt(str[i]);
				sum += road[i];
			}
			int a = Integer.parseInt(str[road.length]);
			int b = Integer.parseInt(str[road.length + 1]);
			for (int i = 1; i < road.length; i++)
				road[i] += road[i - 1];
			double t = ((double)sum / (a + b)) * a;
			for (int i = 0; i < road.length; i++) {
				if (t <= road[i]) {
					System.out.println(i + 1);
					break;
				}
			}
		}

	}

}