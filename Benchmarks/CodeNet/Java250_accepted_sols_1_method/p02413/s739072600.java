import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int gyou = sc.nextInt();
		int retu = sc.nextInt();

		int[][] hyou = new int[gyou][retu];

		for(int i = 0;i < hyou.length;i++) {
			for(int j = 0;j < hyou[i].length;j++) {
				hyou[i][j] = sc.nextInt();
			}
		}

		int[] gyousum = new int[gyou];
		int[] retusum = new int[retu];
		for(int i = 0;i < hyou.length;i++ ){
			for(int j  = 0;j < hyou[i].length;j++) {
				gyousum[i] += hyou[i][j];
				retusum[j] += hyou[i][j];
			}
		}
		for(int i = 0;i < hyou.length;i++) {
			for(int j = 0;j < hyou[i].length; j++) {
				System.out.print(hyou[i][j] + " ");
			}
			System.out.println(gyousum[i]);
		}
		int sum = 0;
		for(int i = 0;i < retusum.length;i++) {
			System.out.print(retusum[i] + " ");
			sum += retusum[i];
		}
		System.out.println(sum);
	}
}