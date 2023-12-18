import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		ArrayList<Integer> list = new ArrayList<>();
		Set<Integer> checkList = new HashSet<>();
		for(int i = 0; i < N; i++) {
			int tmp = Integer.parseInt(sc.next());
			list.add(tmp);
			checkList.add(tmp);
		}
		sc.close();

		Collections.sort(list);

		int count = 1;
		for(int i = 0; i < list.size(); i++) {
			int tmp = list.get(i);
			if(2 * tmp > list.get(N - 1))break;
			//素数の倍数をリストから削除する
			for(int j = tmp; j <= list.get(N - 1); j += tmp) {
				if(list.contains(j) && j != tmp) {
					checkList.remove(j);
				}
			}
		}
		count = checkList.size();
		if(list.get(0) == list.get(1)) {
			count--;
			System.out.println(count);
		}else {
			System.out.println(count);
		}

	}

}