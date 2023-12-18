import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int S = sc.nextInt();
		
		if(S<1200)
		System.out.println("ABC");
		else if(S<2800)
			System.out.println("ARC");
		else
			System.out.println("AGC");
		sc.close();
	}
}