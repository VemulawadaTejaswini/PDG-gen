import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] favorite = new int[m];
		for(int i = 0; i < n; i++) {
			int loopCount = sc.nextInt();
			for(int j = 0; j <loopCount; j++) {
				favorite[sc.nextInt() -1]++;
			}
		}
		int answer = 0;
		for(int i =0; i < m; i++) {
			if(favorite[i] == n) {
				answer++;
			}
		}

		System.out.println(answer);
	}

}