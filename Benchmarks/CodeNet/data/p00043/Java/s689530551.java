import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
	static int[] b = new int [10];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String s = sc.next();
			//if(s.length() == 1) break;
			int[] a = new int[14];
			int[] c = new int[10];
			for(int i = 0; i < s.length(); i++) {
				a[i] = Integer.parseInt(s.substring(i, i + 1));
				c[a[i]]++;
			}
			List<Integer> list = new ArrayList<Integer>();
			for(int i = 1; i <= 9; i++) {
				a[13] = i;
				System.arraycopy(c, 0, b, 0, 10);
				b[i]++;
				if(b[i] >= 5) continue;
				flag = false;
				dfs(0);
				if(flag) {
					list.add(i);
				}
			}
			if(list.size() == 0) {
				System.out.println(0);
			}else {
				for(int i = 0; i < list.size(); i++){
					if(i == list.size() - 1) {
						System.out.println(list.get(i));
					}else {
						System.out.printf("%d ", list.get(i));
					}
				}
			}
		}
		sc.close();
	}
	static boolean flag = false;
	static void dfs(int n) {
		if(n == 5) {
			flag = true;
			return;
		}
		if(flag) return;
		if(n == 0) {
			for(int i = 1; i <= 9; i++) {
				if(b[i] >= 2) {
					b[i] -= 2;
					dfs(n + 1);
					b[i] += 2;
				}
			}
		}
		for(int i = 1; i + 2 <= 9; i++) {
			if(b[i] >= 1 && b[i + 1] >= 1 && b[i + 2] >= 1) {
				b[i]--;
				b[i + 1]--;
				b[i + 2]--;
				dfs(n + 1);
				b[i]++;
				b[i + 1]++;
				b[i + 2]++;
			}
		}
		for(int i = 1; i <= 9; i++) {
			if(b[i] >= 3) {
				b[i] -= 3;
				dfs(n + 1);
				b[i] += 3;
			}
		}
	}
}
