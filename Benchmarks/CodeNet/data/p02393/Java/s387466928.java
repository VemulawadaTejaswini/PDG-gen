import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] split = line.split(" ");
		int[] num = new int[split.length];

		for (int i = 0; i < split.length; i++) {
			num[i] = Integer.parseInt(split[i]);
		}
		
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] > num[j]) {
					int tmp = num[j];
					num[j] = num[i];
					num[i] = tmp;
				}
			}
		}

		for (int i = 0; i < split.length; i++) {
			System.out.print(num[i]);
			if (i != split.length - 1) {
				 System.out.print(" ");
			}
		}
		sc.close();
	}
}