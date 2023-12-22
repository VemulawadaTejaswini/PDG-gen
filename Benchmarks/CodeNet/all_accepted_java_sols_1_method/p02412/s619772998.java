import java.util.Scanner;
import java.util.Arrays;

class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		while(true){
			int n = scanner.nextInt();
			int x = scanner.nextInt();
			int count = 0;

			if(n == 0 && x == 0){
				break;
			}

			for(int i = 1; i < x/3; i++){
				for(int j = i+1; j < n; j++){
					int k = x - i - j;
					if(k > j && k <= n){
					    count ++;
					}
				}
			}
			System.out.println(count);
		}
	}

}