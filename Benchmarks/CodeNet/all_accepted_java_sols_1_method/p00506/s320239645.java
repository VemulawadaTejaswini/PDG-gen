import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num[] = new int[3];
		int n;
		
		n = scanner.nextInt();
		for(int i = 0; i < n; i++) {
			num[i] = scanner.nextInt();
		}
		
		int minNum;
		
		if (n == 2) {
			minNum = Math.min(num[0], num[1]);
			for(int i = 1; i <= minNum; i++) {
				if (num[0] % i == 0 && num[1] % i == 0) {
					System.out.println(i);
				}
			}
		} else {
			minNum = Math.min(Math.min(num[0], num[1]), num[2]);
			for(int i = 1; i <= minNum; i++) {
				if (num[0] % i == 0 && num[1] % i == 0 && num[2] % i == 0) {
					System.out.println(i);
				}
			}
		}
	}
}