import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 入力
		int a1 = sc.nextInt();
		int a2 = sc.nextInt();
		int a3 = sc.nextInt();

		int sa12 = Math.abs(a1 - a2);
		int sa23 = Math.abs(a2 - a3);
		int sa31 = Math.abs(a3 - a1);

		int max = Math.max(Math.max(sa12, sa23), sa31);
		int cost;

		if (max == sa12){
			cost = sa23 + sa31;
		} else if (max == sa23) {
			cost = sa12 + sa31;
		} else {
			cost = sa12 + sa23;
		}

		// 出力
		System.out.println(cost);
	}
}