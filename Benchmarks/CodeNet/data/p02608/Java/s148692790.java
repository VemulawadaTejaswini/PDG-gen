import java.util.Scanner;

public class Main{

	public static void main(String[] args) {


		Scanner scanner = new Scanner(System.in);

		int n    = Integer.parseInt(scanner.nextLine());
		int max  = 50;
		int hos  = (max * max)*6 + 1;
		int[] list = new int[hos];
		int now  = 0;
		for(int i = 1; i < max - 1; i++) {
			for(int j = i + 1; j < max; j++) {
				for(int k = j + 1; k < max + 1; k++) {

					now = i * i + j * j + k * k + i * j + i * k + j * k;
					list[now] += 6;

				}
			}
		}

		for(int i = 1; i < max - 1; i++) {
			for(int j = i + 1; j < max; j++) {

				now = (i * i) * 3 + (j * j) + (i * j)*2;
				list[now] += 3;

				now = (j * j) * 3 + (i * i) + (i * j)*2;
				list[now] += 3;

			}
		}

		for(int i = 1; i < max + 1; i++) {

			now = (i * i)*3*2;
			list[now] ++;

		}

		for(int i = 1; i < n + 1; i++) {

			System.out.println(list[i]);
		}


	}

}
