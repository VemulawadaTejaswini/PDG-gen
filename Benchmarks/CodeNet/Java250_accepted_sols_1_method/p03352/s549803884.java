import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x=sc.nextInt();
		for(;x>1;x--) {
			for(int i=2;i < x; i++) {

				int n = i*i;
				if(n > x) break;

				while(n <= x) {
					if(n==x) {
						System.out.println(x);
						return;
					}
					n *= i;
				}

			}
		}
		System.out.println(x);
	}
}
