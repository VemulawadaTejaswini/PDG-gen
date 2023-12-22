
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int time[] = new int[5];
		for (int i = 0; i < 5; i++) {
			time[i] = scan.nextInt();
		}
		
		int last = 0;
		for (int i = 1; i < 5; i++) {
			if (time[i] % 10 == 0) {
				continue;
			}
			if (time[0] % 10 > time[i] % 10) {
				last = i;
			}
		}
		
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			
			if (time[i] % 10 == 0 || i == last) {
				sum += time[i];
			} else {
				sum += time[i] + (10 - (time[i] % 10));
			}
			
		}
		
		System.out.println(sum);
		scan.close();
	}
}