import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long x=scan.nextLong();
		long y=scan.nextLong();
		if(Math.abs(x-y)%2!=0) System.out.println("Yes");
		else System.out.println("No");
	}

}
