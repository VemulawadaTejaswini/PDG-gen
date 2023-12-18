import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		TreeSet<Integer> set = new TreeSet<>();
		int count = 0;  //setの要素数

		for(int i = 0; i < q; i++) {
			int query = sc.nextInt();

			switch(query) {
			case 0:
				int x = sc.nextInt();
				if(set.add(x)) count++;
				System.out.println(count);
				break;

			case 1:
				x = sc.nextInt();
				if(set.contains(x)) System.out.println(1);
				else System.out.println(0);
				break;

			case 2:
				x = sc.nextInt();
				if(set.remove(x)) count--;
				break;

			case 3:
				int l = sc.nextInt();
				int r = sc.nextInt();
				for(int n : set.subSet(l, true, r, true)) {
					System.out.println(n);
				}
				break;
			}
		}
	}

}

