import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int hamming[] = new int[1000001];
		int count;
		
		int index = 1;
		hamming[1] = 1;
		while (index < 1000001) {
			if (index * 2 < 1000001) {
				hamming[index * 2] = 1;
			}
			if (index * 3 < 1000001) {
				hamming[index * 3] = 1;
			}
			if (index * 5 < 1000001) {
				hamming[index * 5] = 1;
			}
			index++;
			while (index < 1000001 && hamming[index] == 0) {
				index++;
			}
		}

		while (true) {
			int x = sc.nextInt();
			if (x == 0) {
				break;
			}
			int y = sc.nextInt();
			count = 0;
			for (int i = x; i <= y; i++) {
				count += hamming[i];
			}
			System.out.println(count);
		}
	}
}