import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = 0;

		n = sc.nextInt();

		int n1 = n / 500;
		int n2 = (n - n1*500) / 5;

			System.out.println(n1*1000 + n2*5);

	}
}