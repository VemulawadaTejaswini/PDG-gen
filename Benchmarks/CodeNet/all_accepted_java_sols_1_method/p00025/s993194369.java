import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			int[] a = {sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt()};
			int[] b = {sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt()};
			int hit = 0, blow = 0;
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a.length; j++) {
					if (i == j && a[i] == b[j])
						hit++;
					else if (a[i] == b[j]) blow++;
				}
			}
			System.out.println(hit + " " + blow);
		}

	}

}