import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		Set<Integer> set = new HashSet<>(q);
		int count = 0;  //setの要素数

		for(int i = 0; i < q; i++) {
			int query = sc.nextInt();
			int x = sc.nextInt();

			if(query == 0) {
				if(set.add(x)) count++;
				System.out.println(count);
			}
			else {
				if(set.contains(x)) System.out.println(1);
				else System.out.println(0);
			}
		}
	}

}

