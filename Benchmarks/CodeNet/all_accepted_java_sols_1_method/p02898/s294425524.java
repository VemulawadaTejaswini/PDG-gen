import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 入力受付
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int array[] = new int[n];
		for(int i = 0; i < n; i++){
			array[i] = scan.nextInt();
		}

		int counter = 0;

		for(int num: array){
			if(num >= k){
				counter++;
			}
		}

		System.out.println(counter);

	}
}