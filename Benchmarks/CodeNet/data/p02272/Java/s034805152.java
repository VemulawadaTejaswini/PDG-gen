import static java.lang.System.*;
import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static List<Integer> list = new ArrayList<>();
	static int num = 0;

	
	public static void main(String[] args) {
		int n = sc.nextInt();
		for (int i=0; i<n; i++) list.add(sc.nextInt());

		mergeSort(list);

		for (int i=0; i<list.size(); i++) out.print((i==0?"":" ")+list.get(i)); out.println();
		out.println(num);
	}

	
	static void mergeSort(List<Integer> list) {
		int size = list.size();

		//listの大きさが1なら再帰終了
		if (size == 1) return;

		//1でないなら分割
		ArrayList<Integer> L = new ArrayList<>(), R = new ArrayList<>();
		int M = size/2;

			//分割処理、左側を作成
			for (int i=0; i<M; i++) L.add(list.get(i));
			//分割処理、右側を作成
			for (int i=M; i<size; i++) R.add(list.get(i));

			
		//再帰
		mergeSort(L); mergeSort(R);

		//マージ処理
		list.clear();
		int indexL = 0, indexR = 0;
		while (indexL<L.size() || indexR<R.size()) {
			if (indexL == L.size()) {
				list.add(R.get(indexR)); indexR++; num++;
			}
			else if (indexR == R.size()) {
				list.add(L.get(indexL)); indexL++; num++;
			}
			else {
				int tempL = L.get(indexL);
				int tempR = R.get(indexR);
				if (tempL <= tempR) {
					list.add(tempL); indexL++;
				}
				else {
					list.add(tempR); indexR++;
				}
				num++;
			}
		}
	}
}
