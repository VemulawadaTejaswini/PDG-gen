import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int A=stdIn.nextInt();
		int B=stdIn.nextInt();
		int T=stdIn.nextInt();
		A=T/A;
		System.out.println(B*A);
	}
}