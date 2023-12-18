import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int N = sc.nextInt();
		int max =H;
		if (max<W) {
			max = W;
		}
		if (N%max==0) {
			System.out.println(N/max);
		} else {
			System.out.println(N/max+1);
		}
	}
}