import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sum =0;
		int a=N;
		while (N>0) {
			sum += N%10;
			N=N/10;
		}
		if (a%sum==0) {
			System.out.println("Yes");
			return ;
		}
		System.out.println("No");

	}

}