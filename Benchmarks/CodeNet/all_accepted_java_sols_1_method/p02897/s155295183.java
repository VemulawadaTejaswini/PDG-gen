import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int odd,even;
		if(n % 2 == 1) {
			odd = n / 2 + 1;
			even = n / 2;
		}else {
			odd = n / 2;
			even = n / 2;
		}

		if(n == 1) {
			System.out.println(1);
		}else {
			double ans = (double)odd / (double)n;
			System.out.println(ans);
		}
	}
}
