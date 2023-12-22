import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Arrays;

class Main{
	public static void main(String[] args)throws Exception{
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] numbers = new int[n];
		for(int i = 0; i < n; i++){
		    numbers[i] = scanner.nextInt();
		}
		int count = 0;
		int temp = 0;
		int flag = 1;

		while(flag == 1){
			flag = 0;
			for(int i = n-1; i > 0; i--){
				if(numbers[i] < numbers[i-1]){
					temp = numbers[i];
					numbers[i] = numbers[i-1];
					numbers[i-1] = temp;
					flag = 1;
					count++;
				}
			}
		}

		for(int i = 0; i < n; i++){
			if(i == n-1){
				System.out.print(numbers[i]);
				System.out.print("\n");
			}else{
				System.out.print(numbers[i] + " ");
			}
		}
		System.out.println(count);
	}
}