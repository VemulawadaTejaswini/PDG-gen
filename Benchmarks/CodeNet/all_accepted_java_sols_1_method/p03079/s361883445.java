import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		if(n==b&&b==c) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}