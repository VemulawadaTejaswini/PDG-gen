import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long HP = sc.nextLong();
		int N = sc.nextInt();
		
		long sumA = 0;
		
		for(int i=0; i<N; i++) {
			sumA += sc.nextInt();
		}

		if(sumA >= HP)
			System.out.print("Yes");
		else
			System.out.print("No");

		sc.close();

	}

}