import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		boolean ans = false;
		
		for (int i=0; i<=x; i++) {
			if(y == 2*i + 4*(x-i)) {
				ans = true;
			}
		}

		System.out.println(ans ? "Yes" : "No");
		sc.close();
	}

}