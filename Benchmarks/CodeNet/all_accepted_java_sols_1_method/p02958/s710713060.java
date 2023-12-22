import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int seisu = scan.nextInt();
		int count = 0;

		for(int i=1;i<=seisu;i++) {
			int suretu = scan.nextInt();

			if(i!=suretu) {
				count++;
			}
		}

		System.out.println(count <= 2?"YES":"NO");
		scan.close();

	}

}
