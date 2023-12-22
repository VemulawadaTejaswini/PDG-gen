import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //整数の入力
		int total = 0;
		int max = 0;
		for (int i = 0; i < n; i++) {
			int tmp = sc.nextInt();
			if (tmp > max) {
				max = tmp;
			}
			total += tmp;
		}
		System.out.println(total - max / 2);
	}
}