
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();
		
		int time = 0;
		int sum = 0;
		
		while(true) {
			time++;
			sum += time;
			if(X <= sum) {
				break;
			}
		}
		
		System.out.println(time);
		
	}
}

