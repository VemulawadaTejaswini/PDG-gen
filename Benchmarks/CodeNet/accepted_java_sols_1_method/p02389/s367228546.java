import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int height = sc.nextInt();
		int width = sc.nextInt();

		int ret1 = height * width;
		int ret2 = (height * 2) + (width * 2);

		System.out.println(ret1 + " " + ret2);

		sc.close();

	}

}
