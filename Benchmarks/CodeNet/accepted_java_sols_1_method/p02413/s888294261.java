import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt(); 
		int n = sc.nextInt();
		int[][] array = new int[n + 1][r + 1];
		
		for(int i = 0; i < r ;i ++) {
			for(int j = 0;j < n ; j++) {
				array[j][i] = sc.nextInt();
				array[n][i]  = array[n][i] + array[j][i];
				array[j][r]  = array[j][r] + array[j][i];
				array[n][r]  = array[n][r] + array[j][i];
			}
		}
		for(int i = 0; i <= r; i++) {
			for(int j = 0;j < n ; j++) {
				System.out.print(String.format("%d ",array[j][i]));
			}
			System.out.println(array[n][i]);
		}
	}	
}

