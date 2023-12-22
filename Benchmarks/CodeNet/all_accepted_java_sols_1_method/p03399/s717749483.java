import java.util.Scanner;

class Main {
	public static void main(String args[]) {
	
	Scanner stdIn = new Scanner(System.in);
	
	int a = stdIn.nextInt();
	int b = stdIn.nextInt();
	int c = stdIn.nextInt();
	int d = stdIn.nextInt();
	int total = 0;
	
	if (a < b) {
		total += a;
	}
	else {
		total += b;
	}
	
	if (c < d) {
		total += c;
	}
	else {
		total += d;
	}
	
	System.out.println(total);
	
	}
}