import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long ans = 0;
		long cash = 100;
		while(cash < x) {
			cash *= 1.01;
			ans++;
		}
		
		System.out.println(ans);
		sc.close();
	}

}