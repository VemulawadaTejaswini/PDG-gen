import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		
		int ans = 0;
		if(a < 0) {
			ans += -a * c;
			ans += d;
			ans += e * b;
		}else {
			ans += e * (b - a);
		}
		
		System.out.println(ans);
	}
}
