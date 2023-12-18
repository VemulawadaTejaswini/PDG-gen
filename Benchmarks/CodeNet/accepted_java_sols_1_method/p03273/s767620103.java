import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int H = sc.nextInt();
		int W = sc.nextInt();
		String tmp = "";
		String SW = "";
		List<String> a = new ArrayList<String>();

		for (int i = 0; i < H; i++) {
			a.add(sc.next());
		}

		//横方向探索

		for (int i = 0; i < W; i++) {
			tmp += ".";
		}
		for (int i = 0; i < H; i++) {
			if (a.get(i).equals(tmp)) {
				a.remove(i);
				H--;
				i--;
			}
		}

		//縦方向探索
		tmp = "";
		for (int i = 0; i < H; i++) {
			tmp += ".";
		}

		for (int j = 0; j < W; j++) {
			SW = "";
			for (int i = 0; i < H; i++) {
				SW += a.get(i).substring(j, j + 1);
			}
			if (tmp.equals(SW)) {
				for (int i = 0; i < H; i++) {
					a.set(i, a.get(i).substring(0, j) + a.get(i).substring(j + 1, W));
				}
				W--;
				j--;
			}
		}

		//出力
		for (int i = 0; i < H; i++) {
			System.out.println(a.get(i));
		}

		sc.close();
	}

}
