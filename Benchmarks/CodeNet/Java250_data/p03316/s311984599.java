import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = n;
		int sum = 0;
		while(n >= 1) {
			sum += n % 10;
			n /= 10;
		}
		
		if(m % sum == 0)
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}