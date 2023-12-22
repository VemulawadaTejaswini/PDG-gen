import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int A= sc.nextInt();
		int count = H/A;
		if (H%A>0) {
			count ++;
		}
		System.out.println(count);
	}
}