import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws java.io.IOException {
		Scanner scan = new Scanner(System.in);
		long n = scan.nextLong();
		long a = 1;
		for(int i = 1 ; i <= n ; i++){
			a = a*i;
		}
		System.out.println(a);
	}
}