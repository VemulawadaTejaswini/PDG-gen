import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int[][] arr = new int[3][3];
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		if(arr[0][0]-arr[0][1] == arr[1][0]-arr[1][1] && arr[1][0]-arr[1][1] == arr[2][0]-arr[2][1]) {
			if(arr[0][1]-arr[0][2] == arr[1][1]-arr[1][2] && arr[1][1]-arr[1][2] == arr[2][1]-arr[2][2]) {
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");
	}
}