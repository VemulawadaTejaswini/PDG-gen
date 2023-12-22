import java.util.Scanner;

public class Main {
	public static void main(String[] args)  {
		// 入力
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int x = scanner.nextInt();
		int[] aArray = new int[m];

		int check = 0;
		for (int i = 0; i < m; i++) {
			aArray[i] = scanner.nextInt();
			if(check(aArray[i], n-1) && check < aArray[i]) {
				check = aArray[i];
			} else {
				
			}
		}


		if(check(n, 100) && check(m, 100) && check(x, n-1)) {
			int point = 0;
			for (int i = 0; i < aArray.length; i++) {
				if(x < aArray[i]) {
					point = i;
					break;
				}
			}
			System.out.println(Math.min(point, m-point));
		} else {
		}



	}

	static boolean check(int input, int max) {
		return (1 <= input && input <=  max);
	}
}