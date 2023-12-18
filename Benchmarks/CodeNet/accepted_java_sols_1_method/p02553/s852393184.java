import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		long a = scan.nextLong();
		long b = scan.nextLong();
		long c = scan.nextLong();
		long d = scan.nextLong();

		//（a,c）
		long ac = 0;
		ac = a * c;

		//（b,d）
		long bd = 0;
		bd = b * d;

		//（a,d）
		long ad = 0;
		ad = a * d;

		//（b,c）
		long bc = 0;
		bc = b * c;

		long values[] = {ac,bd,ad,bc};
		long max = values[0];

		for(int i = 0; i < values.length; i++) {
			max = Math.max(max, values[i]);
		}


		System.out.println(max);

	}

}
