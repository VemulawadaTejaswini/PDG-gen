import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] tasks = new int[3];

		tasks[0] = sc.nextInt();
		tasks[1] = sc.nextInt();
		tasks[2] = sc.nextInt();

		int minimumCost = Integer.MAX_VALUE;

		for (int i = 0; i < 3; i++) {
			int firstTask = tasks[i];
			int c1 = Math.abs(tasks[(i+1)%3]-firstTask) + Math.abs(tasks[(i+2)%3]-tasks[(i+1)%3]);
			int c2 = Math.abs(tasks[(i+2)%3]-firstTask) + Math.abs(tasks[(i+1)%3]-tasks[(i+2)%3]);
			int cost = Math.min(c1,c2); 
			minimumCost = Math.min(minimumCost, cost);
		}
		System.out.println(minimumCost);
		sc.close();
	}
}
