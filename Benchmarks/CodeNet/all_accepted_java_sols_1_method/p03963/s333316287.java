import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int c = k;
		for(int i = 1; i < n; i++){
			c *= k - 1;
		}
		System.out.println(c);
	}

}
