import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);

		String input = scanner.nextLine();

		String AB[] = input.split(" ");

		int A = Integer.parseInt(AB[0]);

		int B = Integer.parseInt(AB[1]);

		int[] result = new int[3];

		result[0] = A + B;

		result[1] = A - B;

		result[2] = A * B;

		int max = result[0];

		for (int i:result){
			if(i > max) {
				max = i;
			}
		}

		System.out.println(max);
	}

}