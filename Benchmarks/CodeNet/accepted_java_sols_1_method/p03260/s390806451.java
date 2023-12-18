import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int i = in.nextInt();
		if(N%2==1&&i%2==1) {
			System.out.print("Yes");
		}else {
			System.out.print("No");
			
		}

	}
}