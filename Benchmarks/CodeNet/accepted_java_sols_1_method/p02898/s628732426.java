import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int k = scan.nextInt();

		int []  h= new int [1000000];
		int count=0;
		for(int i = 0; i < n; i++) {
			h[i] = scan.nextInt();
			if(h[i] >= k) {
				count++;
			}
		}

		System.out.println(count);
	}
}