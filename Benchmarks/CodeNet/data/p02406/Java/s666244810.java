import java.util.Scanner;

public class Main{

	private static int i = 1;
	private static int n;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		check_Num();
		System.out.println();
		sc.close();
	}

	private static void check_Num() {
		if (i % 3 == 0) {
			System.out.print(" " + i);
			end_Check_Num();
		}
		include3();
	}

	private static void include3() {
		String value = String.valueOf(i);
		for (int index = value.length(); index > 0; index--)
			if (i / (int) Math.pow(10, index - 1) % 10 == 3) {
				System.out.print(" " + i);
			}
		end_Check_Num();
	}

	private static void end_Check_Num() {
		i++;
		if (i <= n) {
			check_Num();
		}
	}
}
