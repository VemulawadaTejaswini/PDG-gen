import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		int n = scan.nextInt();
		int d = scan.nextInt();
		int[][] list = new int[n][2];
		int count = 0;

		for(int i = 0;i < n;i++) {
			for(int j = 0;j < 2;j++) {
				list[i][j] = scan.nextInt();
			}
		}

		for(int i = 0;i < n;i++) {
			if(Math.sqrt(Math.pow(list[i][0], 2) + Math.pow(list[i][1], 2)) <= d) {
				count++;
			}
		}

		System.out.println(count);
	}
}
