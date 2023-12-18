
import java.util.Scanner;
public class Main {
	

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int[][] dataSet = new int[200][];
		int dataSetV = 0;
		for(int i = 0; i < 200; i++) {
			int N = stdIn.nextInt();
			if(N == 0) {
				break;
			}
			dataSetV++;
			dataSet[i] = new int[N];
			for(int j = 0; j < N; j++) {
				dataSet[i][j] = stdIn.nextInt();
			}
		}
		
		OUT:for(int i = 0; i < dataSetV; i++) {
			for(int j = 0; j < dataSet[i].length; j++) {
				if(dataSet[i][j] == 0 || dataSet[i][j] == 1) {
					System.out.println("NA");
					continue OUT;
				}
			}
			System.out.println(dataSet[i].length+1);
			
		}
	}
}