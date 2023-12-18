import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> b = new ArrayList<Integer>();
		for(int i=0; i<n; i++) {
			int e = sc.nextInt();
			a.add(e);
		}
		for(int i=0; i<m; i++) {
			int e = sc.nextInt();
			b.add(e);
		}
		int count = 0;


		while(k > 0 && (a.size()>0 || b.size()>0)) {
			if(a.get(0) <= b.get(0)) {
				k -= a.get(0);
				if(k <= 0) {
					break;
				}
				a.remove(0);
				if(a.size() == 0) {
					a.add(1000000001);
				}
				count++;
			}else {
				k -= b.get(0);
				if(k <= 0) {
					break;
				}
				b.remove(0);
				if(a.size() == 0) {
					a.add(1000000001);
				}
				count++;
			}
		}

		System.out.println(count);
	}

}
