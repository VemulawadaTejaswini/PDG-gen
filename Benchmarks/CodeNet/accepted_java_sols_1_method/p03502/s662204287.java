import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int temp = N ;
		int sum =0;
		while (temp>0) {
			sum +=temp%10;
			temp/=10;
		}
		if (N%sum ==0) {
			System.out.println("Yes");
			return ;
		}
		System.out.println("No");
	}
}