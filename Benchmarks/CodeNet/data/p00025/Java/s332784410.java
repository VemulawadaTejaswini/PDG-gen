import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			int[] sol = {sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt()};
			int[] ans = {sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt()};
			boolean[] check = new boolean[sol.length];
			int hit = 0, blow = 0;
			for (int i = 0; i < sol.length; i++) {
				if (sol[i] == ans[i]) {
					hit++;
					check[i] = true;
				}
			}
			for (int i = 0; i < ans.length; i++) {
				if (!check[i]) {
					for (int j = 0; j < sol.length; j++) {
						if (i == j || check[j]) continue;
						if (ans[i] == sol[j]) {
							blow++;
							check[i] = check[j] = true;
							break;
						}
					}
				}
			}
			System.out.println(hit + " " + blow);
		}

	}

}