import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Arrays;

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
		int min = numbers[0];
		long max = -999999999999l;
		for(int i = 1; i < n; i++){
			if(numbers[i] - min > max){
				max = numbers[i] - min;
			}
			if(numbers[i] < min){
				min = numbers[i];
			}
		}
		System.out.println(max);
	}
}