import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int count = 0;
		
		if(N <= 2) {
			System.out.println(count);
		} else {
			count = (N - N % 3) / 3 ;
			System.out.println(count);
		}
		
	}
}
