import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int x=scanner.nextInt();
		
		int p=0;
		int t=0;
		while(p<x) {
			t++;
			p+=t;
		}
		
		System.out.println(t);

	}
}
