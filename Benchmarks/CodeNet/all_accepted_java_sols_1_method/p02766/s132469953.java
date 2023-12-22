import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		sc.close();
		int a = 1;
		while(N >= K){
			a++;
			N = N/K;
		}
		System.out.println(a);
	}
}