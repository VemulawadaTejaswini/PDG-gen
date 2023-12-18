import java.util.ArrayList;
import java.util.Scanner;

class Main02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		ArrayList<Integer> numList01 = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			numList01.add(i, scanner.nextInt());
		}
		int m = scanner.nextInt();
		ArrayList<Integer> numList02 = new ArrayList<Integer>();
		for (int i = 0; i < m; i++) {
			numList02.add(i, scanner.nextInt());
		}

		int count = 0;
		for (int i = 0; i < m; i++) {
			if(numList01.get(n - 1) < numList02.get(i)){
				if (numList01.contains(numList02.get(i))) {
					count++;
				}
			}
		}
		System.out.println(count);
		scanner.close();
	}
}