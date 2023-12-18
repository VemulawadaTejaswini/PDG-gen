import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static int n, k;
	static int[] array;

	public static boolean canLoad(int p) {//仮にpを最大値に設定して運べるかどうか
		int packages = 0, truck = 0, weightSum;
		while (packages < n && truck < k) {//n個の荷物をk個のトラックで運ぶ
			weightSum = 0; //新しいトラックになるので荷物の合計を０に
			while(packages < n && weightSum + array[packages] <= p) {//packages番目の荷物を載せられるか
				weightSum += array[packages];
				packages++;
			}
			truck++;//今のトラックがいっぱいになったので次のトラックへ
		}
		if(packages == n) {//n個の荷物がトラックに載っていたら
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));
		try {
			String[] strings = br.readLine().split(" ");
			n = Integer.parseInt(strings[0]);
			k = Integer.parseInt(strings[1]);
			array = new int[n];
			for(int i = 0; i < n; i++) {
				array[i] = Integer.parseInt(br.readLine());
			}
			int left = 0;
			int right = 100000 * 10000;//nの最大値100000 * wの最大値10000 がpがとりうる最大値
			int mid = (left + right) / 2;
			int p = 100000 * 10000; //とりあえず最大値にしておく
			while(left <= right) {//2分探索
				if(canLoad(mid)) {
					p = mid; //運べたのでpを更新
					right = mid - 1;//運べたのでもっと小さいpでいけるかもしれない
					mid = (left + right) / 2;
				} else {
					left = mid + 1;//運べなかったのでもっと大きいpが必要
					mid = (left + right) / 2;
				}
			}
			System.out.println(p);
		} catch(NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
