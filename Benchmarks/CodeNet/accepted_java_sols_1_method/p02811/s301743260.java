import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		if(500 * N >= K) {
			System.out.print("Yes");
		}else {
			System.out.print("No");			
		}
	}
}