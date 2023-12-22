import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		int x = 0;
		int i = 0;
		while(true) {
			x = sc.nextInt();
			if(x == 0 || i >10000) {
				break;
			}
			list.add(x);
			i++;
		}
		for(int j = 1; j < i+1; j++) {
			System.out.println("Case " + j + ": " + list.get(j-1));
		}
	}

}
