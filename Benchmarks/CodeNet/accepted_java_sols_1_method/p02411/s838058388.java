import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m, f, r;
		int count = 0;
		int sum = 0;
		int[][] records = new int[50][3];
		for (int i = 0; true; i++) {
			m = sc.nextInt();
			f = sc.nextInt();
			r = sc.nextInt();
			if (m == -1 && f == -1 && r == -1) {
				break;
			}
			records[i][0] = m;
			records[i][1] = f;
			records[i][2] = r;
			count++;
		}
		for (int i = 0; i < count; i++) {
			if (records[i][0] == -1 || records[i][1] == -1) {
				System.out.println("F");
			} else {
				sum = records[i][0] + records[i][1];
				if (sum >= 80) {
					System.out.println("A");
				} else if (sum >= 65) {
					System.out.println("B");
				} else if (sum >= 50) {
					System.out.println("C");
				} else if (sum >= 30) {
					if (records[i][2] >= 50) {
						System.out.println("C");
					} else {
						System.out.println("D");
					}
				} else {
					System.out.println("F");
				}
			}
		}
		sc.close();
	}
}
