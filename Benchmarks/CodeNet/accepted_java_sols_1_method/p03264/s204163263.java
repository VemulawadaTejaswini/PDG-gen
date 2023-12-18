import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int count;
		
		if(n % 2 == 0) {
			count = (n / 2) * (n / 2);
		}else {
			count = (n / 2) * (n / 2 + 1);
		}
		
		System.out.println(count);
	}
}
