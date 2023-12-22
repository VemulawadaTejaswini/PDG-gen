import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int max=0;
		int min=1000;
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			list.add(scan.nextInt());
			max=Math.max(max, list.get(i));
			min=Math.min(min, list.get(i));
		}

		System.out.println(max-min);


	}

}
