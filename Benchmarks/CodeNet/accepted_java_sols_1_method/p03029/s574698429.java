import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int P = sc.nextInt();
		
		P += A*3;
		int pie = P/2;
		System.out.println(pie);
	}

}