import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int A = sc.nextInt();

		int B = sc.nextInt();

		int C = sc.nextInt();

		int D = sc.nextInt();

		int a = 0;

		int b = 0;

		if(N%A==0) {

			a = B * N/A;

		}else {

			a = B * (N/A+1);

		}

		if(N%C==0) {

			b = D * N/C;

		}else {

			b = D * (N/C + 1);

		}

		System.out.println(Math.min(a, b));

	}

}

