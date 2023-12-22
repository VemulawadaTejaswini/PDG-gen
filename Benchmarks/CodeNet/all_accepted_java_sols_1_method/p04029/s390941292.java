import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n=scan.nextInt();
		int a=0;

		int i=0;

		for(i=0; i<n; i++) {
			a=a+1+i;

			//System.out.println(a);
		}
		System.out.println(a);

	}

}