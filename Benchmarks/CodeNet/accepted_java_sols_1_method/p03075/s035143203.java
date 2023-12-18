import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int a = stdin.nextInt();
		int b = stdin.nextInt();
		int c = stdin.nextInt();
		int d = stdin.nextInt();
		int e = stdin.nextInt();
		int k = stdin.nextInt();
		if(e-a<=k) {
			System.out.println("Yay!");
		}else {
			System.out.println(":(");
		}
		

	}

}
