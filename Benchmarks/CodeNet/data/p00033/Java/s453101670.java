import java.util.Scanner;

public class Main {
	int[] boll;
	int index;
	
	void run() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		boll = new int[10];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 10; j++)
				boll[j] = scan.nextInt();
			index = 0;
			System.out.println(solve(0, 0) ? "YES" : "NO");
		}
	}
	
	boolean solve(int left, int right) {
		if (index == 10) return true;
		else {
			if (boll[index] > left) {
				left = boll[index];
				index++;
				return solve(left, right);
			} else if (boll[index] > right) {
				right = boll[index];
				index++;
				return solve(left, right);
			} else return false;
		}
	}
	public static void main(String[] args) {
		new Main().run();
	}
}