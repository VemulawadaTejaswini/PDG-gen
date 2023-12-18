import java.util.ArrayList;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int query1 = 0;
		int query2 = 0;

		ArrayList<Integer> vec = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		for(int i = 0; i < num; i++) {
			query1 = sc.nextInt();
			if(query1 != 2) {
				query2 = sc.nextInt();
			}

			if(query1 == 0) {	// Case: push
				pushBack(vec, query2);
			} else if(query1 == 1) {	// Case: pop
				System.out.println(randomAccess(vec, query2));
			} else {
				popBack(vec);
			}
		}
		sc.close();
	}

	public static ArrayList<Integer> pushBack(ArrayList<Integer> a, int b) {
		// bをaの末尾に追加する
		a.add(b);
		return a;
	}

	public static int randomAccess(ArrayList<Integer> a, int p) {
		// aのp要素を読み込む
		return a.get(p);
	}

	public static ArrayList<Integer> popBack(ArrayList<Integer> a) {
		// aの末尾から要素を削除する
		a.remove(a.size()-1);
		return a;
	}
}

