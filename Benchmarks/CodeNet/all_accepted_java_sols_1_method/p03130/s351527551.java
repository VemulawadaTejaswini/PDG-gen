import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int[] ints = new int[6];

		for (int i = 0; i < 6; i++) {
			ints[i] = Integer.parseInt(sc.next());
		}

		for (int i = 1; i <= 4; i++) {
			int count = 0;
			for (int j = 0; j < 6; j++) {
				if (ints[j] == i) count++;
			}

			if (count == 3) {
				System.out.println("NO");
				sc.close();
				return;
			}
		}

		System.out.println("YES");

		sc.close();
	}

}
