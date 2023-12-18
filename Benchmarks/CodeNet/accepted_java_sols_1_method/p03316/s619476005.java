import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = n;
		int num = 0;
		while (q > 0) {
			num += q % 10;
			q = q / 10;
		}
		
		if(n % num == 0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}

}
