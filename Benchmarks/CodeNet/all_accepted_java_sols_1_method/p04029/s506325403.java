
import java.util.Scanner;
 

public class Main {

	

	public static void main(String[] args) {

		int N , sum = 0;
		Scanner input = new Scanner(System.in);
		N=input.nextInt();
		for (int j = 1; j <= N; j++) {
			sum += j;
		}
		System.out.println(sum);

		
	}

}