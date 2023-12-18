import java.util.Scanner;
class Main {
	public void rec() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(a * b +" "+ (a + b) * 2);
	}
	public static void main(String[] args) {
		new Main().rec();
	}
}