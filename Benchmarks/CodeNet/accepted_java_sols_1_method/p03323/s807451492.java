import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int other = 16 - a - b;
		
		int max = Math.max(a, b);
		int min = Math.min(a, b);
		
		for(int i = 0; i < 16; i++) {
			max--;
			if(max == 0) break;
			if(min > 0) {
				min--;
			} else {
				other--;
			}
			if(max != 0 && min == 0 && other == 0) {
				System.out.println(":(");
				return;
			}
		}
		
		System.out.println("Yay!");
	}
}
