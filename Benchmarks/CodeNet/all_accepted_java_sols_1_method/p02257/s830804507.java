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
		int total = 0;
		int y = 0;
		
		for(int i = 0; i < n; i++){
			numbers[i] = scanner.nextInt();
			if(numbers[i] <= 3){
				total++;
			}else if(numbers[i] % 2 != 0){
				double x = Math.sqrt(numbers[i]);
				for(int j = 2; j <= x; j++){
				    y = 0;
					if(numbers[i] % j == 0){
					    y = 1;
						break;
					}
				}
				if(y == 0){
				    total++;
				}
			}
		}

		System.out.println(total);
	}
}