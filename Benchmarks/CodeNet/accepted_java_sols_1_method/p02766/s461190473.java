import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		sc.close();
		int a = 0;
		while(N>0) {
			a++;
			N=N/K;
		}
		System.out.println(a);
	}

}