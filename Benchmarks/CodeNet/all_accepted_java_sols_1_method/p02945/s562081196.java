import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int puls = a + b;
		int minus = a - b;
		int times = a * b;
		
		int max = 0;
		
		max = Math.max(puls, minus);
		max = Math.max(max, times);

		System.out.print(max);
		
	} 
}