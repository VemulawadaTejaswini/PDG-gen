import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a = n /1000;
		if( n % 1000 == 0) {
			a--;
		}
		System.out.println((a+1)*1000 - n);
	}
}
