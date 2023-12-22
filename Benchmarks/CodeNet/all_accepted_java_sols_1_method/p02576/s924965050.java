import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int X = in.nextInt();
		int T = in.nextInt();
		
		if(N % X == 0) {
			System.out.println(T * (N / X));
		}else {
			System.out.println((T * (N / X)) + T);
		}
	}
}
