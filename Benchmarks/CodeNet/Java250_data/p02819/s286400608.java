import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if(N == 2) System.out.println(N);
		else {
			System.out.println(prime(N));
		}
		
	}
	public static int prime(int n) {
		boolean check = false;
		int count = 0;
		int ans = 0;
		int j = 0;
		
		while(ans == 0) {
			ans = n+j;
			for(int i = 2; i < n + j -1; i++) {
				if((n+j)%i == 0) {
					ans = 0;
					break;
				}
			}
			j++;
		}
		return ans;
	}
}