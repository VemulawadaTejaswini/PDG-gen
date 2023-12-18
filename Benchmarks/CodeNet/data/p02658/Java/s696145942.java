import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean event = true;
		//long a[] = new long[n];
		long a = 0;
		long sum = 1;
		try {
			for(int i = 0; i < n; i++) {
				a = sc.nextInt();
				sum *= a;
			}
		} catch(Exception e) {
			event = false;
		}
		if(event)
			System.out.println(sum);
		else
			System.out.println("-1");
	}
}
