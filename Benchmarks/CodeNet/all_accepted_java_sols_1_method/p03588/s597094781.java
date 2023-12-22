import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] pointInfo = new int[n][2];
		for(int i = 0;i < n;i++) {
			pointInfo[i][0] = sc.nextInt();
			pointInfo[i][1] = sc.nextInt();
		}

		int maxA = pointInfo[0][0];
		int answer =pointInfo[0][0] + pointInfo[0][1];
		for(int i =1;i <n;i++) {
			if(maxA <pointInfo[i][0]) {
				maxA = pointInfo[i][0];
				answer = pointInfo[i][0] + pointInfo[i][1];
			}
		}
		System.out.println(answer);
	}
}