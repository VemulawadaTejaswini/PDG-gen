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
		public int total = 0;
		
		for(int i = 0; i < n; i++){
			numbers[i] = scanner.nextInt();
			isPrime(numbers[i]);
		}

		System.out.println(sum);
	}

	public void isPrime(number){
		if(number <= 2){
			sum++;
		}else if(number % 2 == 0){

		}else{
			double x = Math.sqrt(x);
			while(true){
				for(int i = 3; i < x; i++){
					if(number % i == 0){
						break;
					}
				sum++;
				}
			}
		}
	}
}