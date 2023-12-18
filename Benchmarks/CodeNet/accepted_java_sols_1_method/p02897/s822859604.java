import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 入力受付
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int array[] = new int[n];
		for(int i = 0; i < n; i++){
			array[i] = i+1;
		}

		int counter = 0;

		for(int num: array){
			if(num % 2 != 0){
				counter++;
			}
		}

		System.out.println((double)counter / n);

	}
}