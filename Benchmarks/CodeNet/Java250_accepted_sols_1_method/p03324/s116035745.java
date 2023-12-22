import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int D = sc.nextInt();
		int N = sc.nextInt();
		sc.close();
		
		int ans = 1;
		if(D == 1)
			ans = 100;
		else if(D == 2)
			ans = 10000;
		ans *= N + N/100;
		System.out.println(ans);
	}
}
