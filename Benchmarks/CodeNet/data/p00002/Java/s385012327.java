import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		//System.out.println("");
		
		//Scanner sc = new Scanner(System.in);
		int a, b;
		//a = sc.nextInt();
		//b = sc.nextInt();
		a = 3;
		b = 5;
		int sum = a + b;
		int cnt = 0;
		while(sum > 0) {
			sum = sum / 10;
			cnt++;
		}
		
		System.out.println(cnt);
	}
}