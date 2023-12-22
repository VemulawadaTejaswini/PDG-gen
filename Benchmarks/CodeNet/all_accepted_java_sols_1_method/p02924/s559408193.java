import java.util.Scanner;

public class Main {
	static int intN =0;
	static int sosuCnt =0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		//String[] h = sc.nextLine().split(" ");

		int intN = Integer.parseInt(n);

		long sum=0;
		for (int i = 0;i < intN;i++) {
			sum=sum+i;
		}

		System.out.println(sum);
	}
}