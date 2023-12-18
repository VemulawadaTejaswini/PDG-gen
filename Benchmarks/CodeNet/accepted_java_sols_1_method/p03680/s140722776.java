import java.util.HashMap;
import java.util.Scanner;

// https://atcoder.jp/contests/abc065/tasks/abc065_b
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		for(int i=0;i<n;i++) {
			array[i] = sc.nextInt();
		}
		sc.close();

		int tmp = 1;
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();



		int ans = 0;
		while(true) {


			if(map.containsKey(tmp)){
				System.out.println(-1);
				return;
			}else {
				map.put(tmp, array[tmp-1]);
			}
			if(tmp==2) {
				System.out.println(ans);
				return;
			}
			tmp = array[tmp-1];
			ans = ans + 1;
		}

	}
}
