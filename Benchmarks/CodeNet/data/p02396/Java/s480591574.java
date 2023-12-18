import java.util.Scanner;
class Main {
	public void pi() {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		while(x != 0) {
			System.out.println(x);
			x = sc.nextInt();
		}
	}
	public static void main(String[] args) {
		new Main().pi();
	}
}