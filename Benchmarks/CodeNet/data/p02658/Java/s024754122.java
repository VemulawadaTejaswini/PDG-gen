import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long sum = 1;

		for(int i=0; i<n; i++) {
			long num = sc.nextLong();
			sum *= num;
		}
		if(sum > 1000000000000000000l)
			System.out.println("-1");
		else
			System.out.println(sum);
		sc.close();
	}
}
