import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int N = scan.nextInt();
	int num = 0;
	int ans = 0;

	if (N % 1000 == 0) {
		System.out.println(0);
	}else {
		System.out.println(1000 - N % 1000);
	}

	}
}