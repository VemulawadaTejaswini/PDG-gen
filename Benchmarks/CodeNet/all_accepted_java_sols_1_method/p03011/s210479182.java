import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		int p = sc.nextInt();
		int q = sc.nextInt();
		int r = sc.nextInt();
		int max = 0;
		int sum = p + q + r;
        int[] data = {p, q, r};
        // 最大値を求める
        for(int i = 0; i < data.length; i++)
                max = Math.max(max,data[i]);
		System.out.println(sum - max);


	}

}
