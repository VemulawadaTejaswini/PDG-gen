import java.util.Scanner;
public class Main {
	public static int sum(int a) {
		int ans = 0;
		while(a >= 10) {
			ans += a%10;
			a /= 10;
		}
		ans += a;
		return ans;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int A = stdIn.nextInt();
		int B = stdIn.nextInt();
		int Ans = 0;
		
		for(int i = 1; i <= N; i++) {
			if(A <= sum(i) && sum(i) <= B) {
				Ans += i;
			}
		}
		System.out.println(Ans);

	}

}