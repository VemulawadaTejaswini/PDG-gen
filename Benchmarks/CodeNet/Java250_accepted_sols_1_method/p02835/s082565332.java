import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int[] a = new int[3];
		int sum = 0;
		for(int aa : a) {
			aa = Integer.parseInt(scanner.next());
			sum += aa;
		}
		String ans = "win";
		if(sum > 21) {
			ans = "bust";
		}else {
			ans = "win";
		}
		System.out.println(ans);

	}

}
