import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] num = new int[10000][10000];
		for(int i = 0; i < num.length; i++) {
			for(int j = 0; j < 2; j++) {
				num[i][j] = scan.nextInt();
			}
			if(num[i][0] == 0 && num[i][1] ==0) break;
		}
		for(int i = 0; i < num.length; i++) {
			if(num[i][0] == 0 && num[i][1] == 0) break;
			if(num[i][0] > num[i][1]) {
				int tmp = num[i][0];
				num[i][0] = num[i][1];
				num[i][1] = tmp;
			}
			System.out.println(num[i][0] + " " + num[i][1]);
		}
	}
}
