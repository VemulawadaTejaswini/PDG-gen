import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long n=scan.nextInt();
		long goukei=0;
		for(long i=1;i<n;i++){
			goukei+=i;
		}
		System.out.println(goukei);
	}
}