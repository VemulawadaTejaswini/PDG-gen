import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

// https://atcoder.jp/contests/abc154/tasks/abc154_c
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] array = new int[N];
		for(int i=0;i<N;i++) {
			array[i] = sc.nextInt();
		}
		sc.close();

		// LinkedHashSetオブジェクトを用意
		Set<Integer> linkedHashSet = new LinkedHashSet<Integer>();

		// 配列の要素を順にLinkedHashSetオブジェクトへ追加
		for (int i = 0; i < array.length; i++) {
			linkedHashSet.add(array[i]);
			}

		linkedHashSet.size();

		if(linkedHashSet.size()==array.length) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}

	}

}
