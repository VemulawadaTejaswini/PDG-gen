import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int ans = a-b*2;

		if(ans < 0) {
			System.out.println(0);
		} else {
			System.out.println(ans);
		}

	}

}
