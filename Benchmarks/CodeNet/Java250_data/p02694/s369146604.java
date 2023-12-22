import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Long x = sc.nextLong();
		Long currentDeposit = (long)100; 
		Long yearElapse = (long)0;
		
		while(x > currentDeposit) {
			currentDeposit = (long)(currentDeposit * 1.01);
			yearElapse ++;
		}
		System.out.println(yearElapse);
	}
}