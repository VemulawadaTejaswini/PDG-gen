import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		scan.close();
		if(N <= 999) {
			System.out.println("ABC");
		}else {
			System.out.println("ABD");
		}
	}
}