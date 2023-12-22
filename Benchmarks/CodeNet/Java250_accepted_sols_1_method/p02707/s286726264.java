import java.util.Scanner;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int member_count = sc.nextInt();

		int boss [] = new int[member_count];
		int assistant [] = new int[member_count];

		for (int i = 0; i < member_count; i++) {
			assistant[i] = 0;
		}

		for (int i = 1; i < member_count; i++) {
			boss[i] = sc.nextInt();
			assistant[boss[i] - 1]++;
		}

		for (int i = 0; i < member_count; i++) {
			System.out.println(assistant[i]);
		}

	return;

	}
}
