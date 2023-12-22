import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] data = new int[2][N];
		
		for(int i = 0; i < data.length; i++) {
			for(int j = 0; j < data[i].length; j++) {
				data[i][j] = sc.nextInt();
			}
		}
		
		int max = 0;
		
		for(int i = 0; i < N; i++) {
			int cnt = 0;
			for(int j = 0; j <= i; j++) {
				cnt += data[0][j];
			}
			for(int j = i; j < N; j++) {
				cnt += data[1][j];
			}
			if(max < cnt) max = cnt;
		}
		
		System.out.println(max);
		
		sc.close();

	}

}