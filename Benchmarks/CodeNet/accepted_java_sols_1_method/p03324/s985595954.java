import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int D = sc.nextInt();
		int N = sc.nextInt();
		if (N != 100) {
			int kotae = (int) (Math.pow(100, D)) * N;
			System.out.println(kotae);
		}else{
			int kotae = (int) (Math.pow(100, D)) * (N+1);
			System.out.println(kotae);
		}

	}

}
