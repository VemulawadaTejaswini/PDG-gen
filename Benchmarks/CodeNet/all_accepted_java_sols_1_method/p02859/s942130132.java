import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		scan.close();
		System.out.println((int)(Math.pow(n, 2)));
	}

}