import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		float T = sc.nextFloat()+0.5f;
		int res = 0;

		while(A<=T) {
			res+=B;
			T -= A;
		}
		System.out.println(res);


	}

}