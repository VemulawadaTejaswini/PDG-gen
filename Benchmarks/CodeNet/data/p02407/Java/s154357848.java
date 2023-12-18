import java.util.Scanner;

public class Main {
	private int n;
	public Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Main main = new Main();
		main.n = main.sc.nextInt();
		main.print();
	}
	public void print() {
		print(0);
	}
	private void print(int i) {
		if (i != n) {
			int a = sc.nextInt();
			print(i + 1);
			System.out.print(i == 0 ? a + "\n" : a + " ");
		}
	}
}
