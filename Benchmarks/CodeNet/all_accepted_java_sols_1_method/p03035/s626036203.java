import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		int sum = sc.nextInt();
		int total = 0;
		
		if (age <= 5) {
			;
		} else if (age >= 6 && age <= 12) {
			total = sum / 2;
		} else {
			total = sum;
		}
		
		System.out.println(total);
	}	
}