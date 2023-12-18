import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int ans = 0;
		ans += 10 - n%10;
		ans += (10 - n%100/10) * 10;
		ans += (10 - n/100) * 100;
		
		System.out.println(ans);
	}
}
