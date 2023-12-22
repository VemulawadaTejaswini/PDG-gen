import java.util.Scanner;

class Main {
	public static void main(String[] args){
		Scanner cin = new Scanner(System.in);
		
		int n;
		int ans = 100000;
		
		n = cin.nextInt();
		
		while (n > 0){
			ans += ans / 100 * 5;
			if (ans % 1000 != 0){
				ans /= 1000;
				ans *= 1000;
				ans += 1000;
			}
			n--;
		}
		
		System.out.println(ans);
	}
}