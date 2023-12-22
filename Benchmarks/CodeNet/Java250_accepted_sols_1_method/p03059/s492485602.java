import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int interval = sc.nextInt();
		int biscuit = sc.nextInt();
		int time = sc.nextInt();
		int count = time / interval;
		System.out.println(biscuit * count);
	}
}