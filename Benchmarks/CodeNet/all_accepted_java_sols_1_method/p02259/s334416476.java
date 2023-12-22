import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);
		String line1 = sc.nextLine();
		int n = Integer.parseInt(line1);

		String line2 = sc.nextLine();
		String[] kari = line2.split(" ");
		int[] num = new int[n];
		for (int i = 0; i < n; i++) {
			num[i] = Integer.parseInt(kari[i]);
		}

		int answer = 0;

		for (int i = 0; i < n - 1; i++) {
			for (int j = n - 1; j > i; j--) {
				if (num[j - 1] > num[j]) {
					int v = num[j];
					num[j] = num[j - 1];
					num[j - 1] = v;
					answer++;
				}
			}
		}

		StringBuilder str = new StringBuilder();

		for (int i = 0; i < n - 1; i++) {
			str.append(num[i]);
			str.append(" ");
		}
		str.append(num[n - 1]);

		System.out.println(str);
		System.out.println(answer);

	}

}