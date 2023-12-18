
import java.util.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	
	void run() {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String str = sc.next();
			int[] num = new int[9];
			for(int i=0;i<13;i++) num[str.charAt(i)-'0'-1]++;
			LinkedList<Integer> list = new LinkedList<Integer>();
			for(int i=0;i<9;i++) {
				int[] tmp = num.clone();
				if(tmp[i] == 4) continue;
				tmp[i]++;
				if(solve(tmp, 0, false)) list.add(i);
			}
			if(list.isEmpty()) System.out.println(0);
			else {
				System.out.print(list.get(0));
				for(int i=1;i<list.size();i++) {
					System.out.print(" " + list.get(i));
				}
				System.out.println();
			}
			
		}
	}
	
	boolean solve(int[] num, int i, boolean flg) {
		if( i== 9 ) return true;
		if( num[i] == 0 ) return solve(num, i+1, flg);
		if( num[i] >= 3 ) {
			num[i] -= 3;
			if(solve(num, i, flg)) return true;
			num[i] += 3;
		}
		if(!flg && num[i] >= 2) {
			num[i] -= 2;
			if(solve(num, i, true)) return true;
			num[i] += 2;
		}
		if( i < 7 && num[i] >= 1 && num[i+1] >= 1 && num[i+2] >= 1) {
			num[i]--; num[i+1]--; num[i+2]--;
			if(solve(num, i, flg)) return true;
			num[i]++; num[i+1]++; num[i+2]++;
		}
		return false;
	}
	public static void main(String[] args) {
		new Main().run();
	}
}