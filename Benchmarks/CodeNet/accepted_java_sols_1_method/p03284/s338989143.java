import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int a = 0;
		int b = 0;
		
		a = n / k;
		b = n % k;
		
		if (b == 0){
			System.out.println(0);
		}
		else {
			System.out.println(1);
		}
		
		
		
		
		
	}

}
