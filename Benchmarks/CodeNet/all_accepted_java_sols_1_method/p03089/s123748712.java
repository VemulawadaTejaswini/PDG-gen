import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<Integer> b = new ArrayList<Integer>(N);
		for(int i = 0; i < N; i++) {
			b.add(sc.nextInt());
		}
		ArrayList<Integer> ans = new ArrayList<Integer>();
		boolean isExist = true;
		while(!b.isEmpty()) {
			int rm_ind = -1;
			for(int i = 0; i < b.size(); i++) {
				if(b.get(i) == i + 1) {
					rm_ind = i;
				}
			}
			if(rm_ind == -1) {
				isExist = false;
				break;
			}
			b.remove(rm_ind);
			ans.add(rm_ind + 1);
		}
		if(isExist) {
			Collections.reverse(ans);
			for(int a : ans) {
				System.out.println(a);
			}
		}
		else {
			System.out.println(-1);
		}
	}
}
