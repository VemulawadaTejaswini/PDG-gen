import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int d = sc.nextInt();

		String space[] = new String[n];
		int countSpace;
		int countD = 0;

		for(int i = 0; i < n; i++) {
			countSpace = 0;
			space[i] = sc.next();
			for(int j = 0; j < m; j++) {
				if(space[i].charAt(j) == '#') {
					countD += Math.max(countSpace - d + 1, 0);
					countSpace = 0;
				}
				else {
					countSpace++;
					if(j == m - 1) countD += Math.max(countSpace - d + 1, 0);
				}
			}
		}

		for(int i = 0; i < m; i++) {
			countSpace = 0;
			for(int j = 0; j < n; j++) {
				if(space[j].charAt(i) == '#') {
					countD += Math.max(countSpace - d + 1, 0);
					countSpace = 0;
				}
				else {
					countSpace++;
					if(j == n - 1) countD += Math.max(countSpace - d + 1, 0);
				}
			}
		}

		System.out.println(countD);
	}

}

