import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();
		if((A == 1 && B == 2) || (A == 2 && B == 1)){
			System.out.println(3);
		}else if((A == 1 && B == 3) || (A == 3 && B == 1)){
			System.out.println(2);
		}else if((A == 3 && B == 2) || (A == 2 && B == 3)){
			System.out.println(1);
		}
	}
}