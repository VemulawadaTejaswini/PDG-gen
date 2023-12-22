import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int bit = 0;
		for (int i= 0;i<n;i++) {
			bit|=sc.nextInt();
		}
		System.out.println(Integer.numberOfTrailingZeros(bit));

	}
}
