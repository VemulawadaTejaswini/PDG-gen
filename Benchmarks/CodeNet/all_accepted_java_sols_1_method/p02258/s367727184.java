import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();

		int x1 =sc.nextInt();
		int x2 =sc.nextInt();

		int max = x2-x1;
		int min = Math.min(x1,x2);

		for(int i=0; i<count-2; i++) {
			int price = sc.nextInt();
			max = Math.max(max, price-min);
			min = Math.min(min, price);
		}
		System.out.println(max);

	}

}
