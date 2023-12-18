import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int A = sc.nextInt();

		int B = sc.nextInt();

		int trainMoney = A * N;

		if (trainMoney <= B) {
			System.out.println(trainMoney);
		} else {
			System.out.println(B);
		}

	}

}