import java.util.Arrays;
import java.util.Scanner;


public class Main{
	
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()) {
			System.out.println(prime(sc.nextInt()));
		}
		sc.close();
	}
	
	static int prime(int n) {
		boolean[] result = new boolean[n];
		int count = 0;
		Arrays.fill(result, true);
		result[1-1] = false;
		for(int i = 2; i <= n; i++){
			if(result[i-1]) {
				count++;
				for(int j = 2; i * j <= n; j++) {
					result[i * j - 1] = false;
				}
			}
		}
		return count;
	}
}