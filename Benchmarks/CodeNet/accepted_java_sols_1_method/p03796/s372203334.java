import java.util.Scanner;
import java.util.Arrays;

public class Main{

	public static void main(String... args){
		Scanner scan = new Scanner(System.in);

		// input
		int num = scan.nextInt();
		
		// check
		long power = 1;
		for(int i = 1; i <= num; i++){
			power *= i;
			if(power > 1000000007){
				power %= 1000000007;
			}
		}
		
		// answer
		System.out.println(power % 1000000007);
		
	}
}