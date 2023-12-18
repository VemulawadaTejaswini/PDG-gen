import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){

			int N = scan.nextInt();


			long count = 0;

			for(int i = 1;i<=N-1;i++) {
				count+=(long)((N-1)/i);
			}
			System.out.println(count);

		}


	}


}
