import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();

		if(K > B) {
			System.out.println("NG");
			return;
		}


		int tmpK = K;
		for(int i=1; i<1000; i++) {

			if(tmpK >= A && tmpK <= B) {
				System.out.println("OK");
				return;
			}

			if(tmpK > B) {
				System.out.println("NG");
				return;
			}
			tmpK += K;

		}

	}

}
