import java.util.Scanner;

public class Main {
	public void exec() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println((a<b && b<c)?"Yes":"No");
		sc.close();
	}

	public static void main(String[] args)  {
		new Main().exec();
	}
}