import java.util.Scanner;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K=sc.nextInt();
		int ki[]=new int[]{1, 1, 1, 2, 1, 2, 1
				, 5, 2, 2, 1, 5, 1, 2, 1, 14, 1, 5, 1, 5, 2, 2, 1,
				15, 2, 2, 5, 4, 1, 4, 1,51};
		System.out.println(ki[K-1]);

	}
}
