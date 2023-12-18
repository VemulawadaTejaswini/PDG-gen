import java.util.Scanner;

public class Main {
	//java11

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();

		int t_value = A;
		int a_value = C;
		while(true) {
			a_value -= B;
			if(a_value <= 0) {
				System.out.println("Yes");
				break;
			}
			t_value -= D;
			if(t_value <= 0) {
				System.out.println("No");
				break;
			}
		}

	}
}
