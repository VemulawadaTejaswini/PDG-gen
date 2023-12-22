import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int kisuu = (n + 1) / 2; 
		double ans = (double)kisuu * 1.0 / (double)n;
		System.out.println(ans);
		
	}

}
