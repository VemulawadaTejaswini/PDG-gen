import java.util.Scanner;

public class Main {
	public void exec() {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println(x * x * x);
	}

	public static void main(String[] args)  {
		new Main().exec();
	}
}