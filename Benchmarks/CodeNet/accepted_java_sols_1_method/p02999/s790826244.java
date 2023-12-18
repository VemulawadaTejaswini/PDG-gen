import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int a = in.nextInt();
		System.out.println(x<a?"0":"10");
		in.close();
	}

}
