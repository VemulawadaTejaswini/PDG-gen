import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

class Main{
	public static void main(String[] args)throws Exception{
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] numbers = new int[n];
		for(int i = 0; i < n; i++){
			numbers[i] = scanner.nextInt();
		}

		Arrays.sort(numbers);

		System.out.println(numbers[n-1] - numbers[0]);
	}
}