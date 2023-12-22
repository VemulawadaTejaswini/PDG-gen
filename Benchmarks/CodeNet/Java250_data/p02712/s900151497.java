import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);		
		int b = a.nextInt();
		long sum = 0;
		for(int i = 1; i <= b; i++) {
			if(i % 15 == 0) {
				
			}else if(i % 3 == 0) {
				
			}else if(i % 5 == 0) {
				
			}else {
				sum += i;
			}
		}
		System.out.println(sum);
	}
}