import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int N = scan.nextInt();
	int remainder;
	scan.close();
	if(N >= 1000) {
	remainder = 1000 - (N % 1000);
	}
	else {
	remainder = 1000 - N;
}
	System.out.println(remainder);
}
}
