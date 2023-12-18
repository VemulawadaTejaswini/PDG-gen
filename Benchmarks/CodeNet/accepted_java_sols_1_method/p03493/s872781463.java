import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int S = sc.nextInt();
		
		int s1 = S % 10;
		int s2 = S / 10 % 10;
		int s3 = S / 100 % 10;
		
		System.out.println(s1 + s2 + s3);
		
	}
}
