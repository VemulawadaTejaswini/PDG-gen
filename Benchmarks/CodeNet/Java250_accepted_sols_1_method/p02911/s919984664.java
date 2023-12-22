import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n, k, q;

		String[] sp = scanner.nextLine().split(" ");
		n = Integer.parseInt(sp[0]);
		k = Integer.parseInt(sp[1]);
		q = Integer.parseInt(sp[2]);

		int[] members = new int[n];
		for (int i = 0; i < n; i++) {
			members[i] = k;
		}

		int[] corrects = new int[q];
		for (int i = 0; i < q; i++) {
			corrects[i] = Integer.parseInt(scanner.nextLine());
		}
		scanner.close();

		for (int i = 0; i < q; i++) {
			members[corrects[i] - 1] = members[corrects[i] - 1] + 1;
			//			for (int j = 0; j < n; j++) {
//				if (j + 1 != corrects[i]) {
//					members[j] = members[j] - 1;
//				}
//			}
		}
		
		for (int i = 0; i < n; i++) {
			members[i] = members[i] - q;
		}


		for (int i = 0; i < n; i++) {
			if(members[i] <= 0) {
				System.out.println("No");
			} else {
				System.out.println("Yes");
			}
		}
	}
}