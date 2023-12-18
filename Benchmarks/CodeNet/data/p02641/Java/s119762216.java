import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = Integer.parseInt(sc.next());
		int N = Integer.parseInt(sc.next());
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> checkList = new ArrayList<>();
		for(int i = 0; i < 100; i++) {
			checkList.add(i + 1);
		}
		for(int i = 0; i < N; i++) {
			list.add(Integer.parseInt(sc.next()));
		}
		sc.close();
		Collections.sort(list);

		if((!list.contains(X))) {
			System.out.println(X);
			return;
		}

		boolean check = false;
		int index = 1;
		int ans = X;

		while(!check) {
			int tmp1 = X - index;
			if(!(list.contains(tmp1))) {
				ans = tmp1;
				break;
			}
			int tmp2 = X + index;
			if(!(list.contains(tmp2))) {
				ans = tmp2;
				break;
			}
			index++;
		}
		System.out.println(ans);
		return;

	}

}