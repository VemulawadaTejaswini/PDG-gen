import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		while (true) {
			int cnt = in.nextInt();
			if (cnt == 0)
				break;
			int i = 0;
			int[] str = new int[cnt * 2];
			while (i < cnt * 2) {
				str[i] = in.nextInt();
				i++;
			}

			int p1 = 0, p2 = 0;
			for (int j = 0; j < cnt * 2; j += 2) {
				if (str[j] > str[j + 1])
					p1 += (str[j] + str[j + 1]);
				else if (str[j] < str[j + 1])
					p2 += (str[j] + str[j + 1]);
				else {
					p1 += str[j];
					p2 += str[j + 1];
				}
			}
			System.out.println(p1 + " " + p2);
		}
	}
}