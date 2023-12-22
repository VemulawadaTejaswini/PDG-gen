import java.util.Scanner;


public class Main {
	

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int[] s = new int[n];
		
		for(int i = 0; i < n; i++) {
			s[i] = stdIn.nextInt();
		}
		
		for(int i = n-1; i > 0; i--) {
			System.out.print(s[i] + " ");
		}
		System.out.println(s[0]);
	}

}