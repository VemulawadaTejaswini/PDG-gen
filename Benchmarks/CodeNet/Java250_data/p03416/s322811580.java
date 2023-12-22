import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str1 = sc.nextLine().split(" ");
		int a = Integer.parseInt(str1[0]);
		int b = Integer.parseInt(str1[1]);
		int count = 0;

		for (; a <= b; a++) {
			int tmp = a;
			int reverse = 0;
			while (tmp > 0) {
				int residue = tmp % 10;
				reverse = reverse * 10 + residue;
				tmp /= 10;
			}
			if (a == reverse)
				count++;
		}
		System.out.println(count);

		sc.close();

	}

}
