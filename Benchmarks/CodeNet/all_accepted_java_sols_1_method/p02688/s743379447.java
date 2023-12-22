import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] okasiInfo = new int[n +1];
		for(int i = 0; i < k;i++) {
			int d = sc.nextInt();
			for(int j = 0; j < d;j++) {
				okasiInfo[sc.nextInt()]++;
			}
		}
		int answer = 0;
		for(int i = 1;i <= n;i++) {
			if(okasiInfo[i] ==0) {
				answer++;
			}
		}
		System.out.println(answer);
	}
}