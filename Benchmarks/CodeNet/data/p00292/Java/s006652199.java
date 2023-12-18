import java.util.*;
class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		for(int i = 0; i < n; i++) {
			int k = stdIn.nextInt();
			int p = stdIn.nextInt();
			System.out.println((k-1) % p+1);
		}
	}
}