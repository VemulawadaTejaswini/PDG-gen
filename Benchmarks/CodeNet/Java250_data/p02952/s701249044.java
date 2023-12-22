import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int l = String.valueOf(N).length();
		double ans = 0;
		if(l/2 == 3) {
			ans += 90909;
		}else if(l/2 == 2) {
			ans += 909;
		}else if(l/2 == 1){
			ans += 9;
		}
		if(l%2 == 1) {
			ans += N - Math.pow(10, l-1) + 1;
		}
		
		System.out.println((int)ans);
	}
}