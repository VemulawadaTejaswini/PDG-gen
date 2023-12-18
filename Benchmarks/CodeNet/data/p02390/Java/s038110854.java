import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int S = scanner.nextInt();
		int s = S%60;
		int temp = S/60;
		int m = temp%60;
		int h = temp/60;
		System.out.println(h + ":" + m + ":" + s);
		scanner.close();
	}

}
