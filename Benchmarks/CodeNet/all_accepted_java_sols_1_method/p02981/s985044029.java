import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int sum = N*A;

		if(sum<=B) {
			System.out.println(sum);
		}else {
			System.out.println(B);
		}


	}

}