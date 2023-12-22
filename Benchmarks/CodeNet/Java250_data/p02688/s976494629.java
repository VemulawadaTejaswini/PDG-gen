import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] list = new int[n];

		for (int i = 0; i < k; i++) {
			int num = sc.nextInt();
			for (int j = 0; j < num; j++) {
				int index = sc.nextInt();
				list[index-1] += 1;
			}
		}

		int count = 0;
		for (int num : list) {
			if(num == 0) {
				count++;
			}
		}
		System.out.println(count);
		sc.close();

	}

}
