import java.util.Scanner;

class Main {
	public static void main(String[] args) {
	
		Scanner stdIn = new Scanner(System.in);
		
		byte x = stdIn.nextByte();
		
		if (x == 3 || x == 5 || x == 7) {
			System.out.println("YES");
			return;
		}
		
		System.out.println("NO");
	
	}
}