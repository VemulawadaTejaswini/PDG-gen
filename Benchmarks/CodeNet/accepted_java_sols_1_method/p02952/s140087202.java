import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int ans;
		if (n < 10) {
			ans = n;
		} else if (n < 100) {
			ans = 9;
		} else if (n < 1000) {
			ans = 9 + n - 99;
		} else if (n < 10000) {
			ans = 909;
		} else if (n < 100000){
			ans = 909 + n - 9999;
		} else {
			ans = 90909;
		}
		
		System.out.println(ans);
		
		sc.close();
	}
	
}


