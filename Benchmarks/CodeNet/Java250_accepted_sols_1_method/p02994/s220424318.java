import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();

		int n = Integer.parseInt(str.split(" ")[0]);
		int l = Integer.parseInt(str.split(" ")[1]);

		int min = l;
		int sum = 0;
		int w = 0;
		for(int i = 0; i<n; i++) {
			w = l + i;
			sum += w;

			if(Math.abs(l + min) > Math.abs(w)) {
				min = i;
			}
		}

		System.out.println(sum - l - min);


	}
}
