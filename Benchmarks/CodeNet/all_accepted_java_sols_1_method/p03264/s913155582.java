import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int k = stdIn.nextInt();
		
		if (k % 2 == 0) {
			System.out.println(k*k/4);
			return;
		}
		if (k % 2 == 1) {
			System.out.println((k-1)*(k-1)/4 + k/2);
			return;
		}
		
	
	}

}