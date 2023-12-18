import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();

		int a = scanner.nextInt();

		for(int i=1; i<=3;i++) {


		if(i != n && i != a) {
			System.out.println(i);
			return;
		}
		}
	}

}