import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a,b,c,sum;
		a = scan.nextInt();
		b = scan.nextInt();
		
		sum = a % b;
		
		if(sum == 0) sum = a / b;
		else sum = a / b + sum;
		
		System.out.println(sum);
	}
}
