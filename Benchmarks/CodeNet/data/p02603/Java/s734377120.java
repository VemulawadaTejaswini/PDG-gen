import java.util.*;
import java.util.function.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
Scanner s = new Scanner(System.in);
		int N = Integer.valueOf(s.next());
		int[] A = new int[N];
		int trend = 0; // 0 = down, 1 = -, 2 = up
		List<int[]> list = new ArrayList<>(); // 0=buy or sell, 1=index
		A[0] = Integer.valueOf(s.next());
		for(int i = 1; i < N; i++) {
			A[i] = Integer.valueOf(s.next());
			if(A[i] > A[i-1]) {
				if(trend == 0) list.add(new int[]{0, i-1}); // 0 = buy
				trend = 2;
			} else if(A[i] < A[i-1]) {
				if(trend == 2) list.add(new int[]{1, i-1}); // 0 = buy
				trend = 0;
			}
		}

		long money = 1000;
		if(list.isEmpty()) {
			if(trend == 2) {
				int stock = 1000 / A[0];
				int amari = 1000 - stock * A[0];
				money = amari + stock * A[N-1];
			}
		}else {
			for(int i = 0; i < list.size(); i++) {
				int[] cur = list.get(i);
				// 売る場合
				if(cur[0] == 1) {
					int index = (i == 0 ? 0 : list.get(i-1)[1]);
					long stock = money / A[index];
					long amari = money - A[index] * stock;
					money = amari + stock * A[cur[1]];
				}
			}

			if(list.get(list.size()-1)[0] == 0) {
				int index = list.get(list.size()-1)[1];
				long stock = money / A[index];
				long amari = money - A[index] * stock;
				money = amari + stock * A[N-1];
			}
		}
		System.out.println(money);
	}
}