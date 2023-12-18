import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int ave = (int) Math.ceil((double) (a + b) / (double) 2);
		System.out.println(ave);
		sc.close();
	}
}