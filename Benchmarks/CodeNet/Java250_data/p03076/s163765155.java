import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int[][] n = new int[5][3];
		int min = 10;
		int minp = 0;
		int sum = 0;

		for (int i = 0; i < 5; i++) {
			n[i][0] = sc.nextInt();
			n[i][1] = n[i][0] % 10;
			if (n[i][1] == 0) {
				n[i][2] = n[i][0];
			} else {
				n[i][2] = (n[i][0] + 10) / 10 * 10;
				if (n[i][1] < min) {
					min = n[i][1];
					minp = i;
				}
			}
			

		}
		
		for(int k=0; k<5;k++){
			sum += n[k][2];
		}
		sum = sum - n[minp][2] + n[minp][0];
		System.out.println(sum);
		

	}
}