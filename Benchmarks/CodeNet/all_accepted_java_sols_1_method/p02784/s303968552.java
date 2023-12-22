import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		int n = sc.nextInt();

		boolean fin = false;

		for(int i=0;i<n;i++) {
			int a = sc.nextInt();
			h -= a;
			if(h<=0) {
				System.out.println("Yes");
				fin = true;
				break;
			}
		}

		if(!fin) {
			System.out.println("No");
		}

	}
}
