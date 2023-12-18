import java.util.Scanner;


public class Main {
	static int Fact(int n){
		return n == 0 ? 1 : n * Fact(n - 1);
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		System.out.println(Fact(m));
		in.close();
	}
}
				