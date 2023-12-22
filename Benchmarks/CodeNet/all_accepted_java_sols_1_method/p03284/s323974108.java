import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();
		scan.close();
		if(N % K == 0) {
			System.out.println(0);
		}else {
			System.out.println(1);
		}
	}
}