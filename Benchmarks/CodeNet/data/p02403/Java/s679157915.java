import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int arr[][] = new int[4][2];
		int i = 0, j=0, k=0;
		for(i = 0; i<300 ; i++) {
			arr[i][0] = stdin.nextInt();
			arr[i][1] = stdin.nextInt();
			if (arr[i][0] == 0 && arr[i][1] == 0) {
				break;
			}
		}
		for(i = 0; i< arr[k][0] ; i++) {		
			for(j = 0; j< arr[k][1] ; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}
}