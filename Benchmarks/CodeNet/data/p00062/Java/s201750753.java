import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int[] num = new int[10];
		int dataset = 2;

		for(int cnt = 0; cnt < dataset; cnt++) {
			for(int i = 0 ; i < num.length; i++) {
				num[i] = stdin.nextInt();
			}

			for(int i = 0; i < num.length; i++) {

				for(int j = 0; j < num.length -  i - 1; j++) {
					num[j] = (num[j] + num[j + 1]) % 10;

				}

			}

			System.out.println(num[0]);
		}
	}

}