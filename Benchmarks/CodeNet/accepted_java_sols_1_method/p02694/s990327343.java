import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long x = sc.nextLong();
		
		int year = 0;
		long deposit = 100;
		while (deposit < x) {
			deposit = deposit + deposit / 100;
			year++;
		}
		
		System.out.println(year);
	}
	
}
