import java.util.Scanner;

public class Main {
	
	static long[] maxPas = new long[5];
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int T = sc.nextInt();
		
		if(T/A > 0) {
			System.out.println(T/A*B);
		} else {
			System.out.println(0);
		}
		
	}

}