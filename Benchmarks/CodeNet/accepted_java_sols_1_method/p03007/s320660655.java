import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		long integer[] = new long[num];
		boolean plus[] = new boolean[num];
		for(int i = 0; i < num; i ++) {
			integer[i] = sc.nextLong();
		}
		Arrays.sort(integer);
		for(int i = 0; i < num; i ++) {
			plus[i] = i == 0 ? false : i == num - 1 ? true : integer[i] >= 0;
		}
		int count[] = {0, 0};
		int ans = 0;
		PriorityQueue<Long> lPlus = new PriorityQueue<>();
		PriorityQueue<Long> lMinus = new PriorityQueue<>();
		for(int i = 0; i < num; i ++) {
			count[plus[i] ? 1 : 0] ++;
			ans += integer[i] * (plus[i] ? 1 : -1);
			if(plus[i]) {
				lPlus.add(integer[i]);
			}else {
				lMinus.add(integer[i]);
			}
		}
		System.out.println(ans);


		for(int n = 1; n <= num - 1; n ++) {
			long tmp[] = {(long)lPlus.poll(), (long)lMinus.poll()};
			if(lPlus.size() <= lMinus.size()) {
				System.out.println(tmp[0]+" "+tmp[1]);
				lPlus.add(tmp[0] - tmp[1]);
			}else {
				System.out.println(tmp[1]+" "+tmp[0]);
				lMinus.add(tmp[1] - tmp[0]);
			}
		}
	}
}