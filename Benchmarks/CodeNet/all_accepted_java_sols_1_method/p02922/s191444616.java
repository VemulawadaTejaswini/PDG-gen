import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int count = 0;

		while(true) {
			if((A-1) * count + 1 >= B) {
				break;
			}
			count += 1;
		}
		System.out.println(count);
	}
}