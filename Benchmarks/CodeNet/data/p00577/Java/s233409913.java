import java.util.Scanner;
public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		char stamps[] = new char[n];
		sc.close();
		stamps = str.toCharArray();
		int count = 0;
		int point = 1;
		while (point < n) {
			if (stamps[point] != stamps[point - 1]) {
				count++;
				point += 2;
			} else {
				point++;
			}
			if (point > n) {
				break;
			}

		}
		System.out.println(count);
	}
}

