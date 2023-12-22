import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {


		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		ArrayList<Integer> a =new ArrayList<>();

		//得点列aを生成
		for(int i=0; i < n; i++) {
			a.add(Integer.parseInt(sc.next()));
		}

		//降順にソート
		Collections.sort(a, Collections.reverseOrder());

		int alice = 0;
		int bob = 0;

		for(int i=0; i<n; i++) {
			if(i%2==0) {
				alice+=a.get(i);
			}else {
				bob+=a.get(i);
			}
		}

		int dif = alice - bob;

		System.out.println(dif);

	}
}
