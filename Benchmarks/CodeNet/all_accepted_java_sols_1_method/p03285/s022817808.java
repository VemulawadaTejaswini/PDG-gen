import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int sum = 0;

		boolean flag = false;

		for(int i=0;i<N+1;i++) {

			for(int j=0;j<N-i+1;j++) {

				sum = 4*i + 7*j;

				if(sum == N) {

					flag = true;

				}

			}

		}

		if(flag == true) {

			System.out.println("Yes");
		}else {

			System.out.println("No");
		}

	}

}
