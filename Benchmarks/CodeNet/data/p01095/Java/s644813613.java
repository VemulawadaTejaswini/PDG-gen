import java.util.ArrayList;
/**
 * 竹の花
 * 入力
 * n m
 * n:使うことができる最小のn年竹
 * m:ブロック数
 * 全てのブロックに竹を植え全て花が咲かない最初の年は何年後か。
 * n年竹から始め、nの倍数以外の竹を植えて行く。
 * その次のいずれの倍数でも無い年が答え
*/
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		//bamboo flower
		Scanner sc = new Scanner(System.in);
		int min, block;
		while (true) {
			min = sc.nextInt();
			if (min == 0) {
				break;
			}
			block = sc.nextInt();
			ArrayList<Integer> year = new ArrayList<Integer>();
			year.add(min);
			for (int i = 1; i < block; i++) {//blockの数だけループ
				year.add(calcNext(year));
			}
System.out.println(calcNext(year));
		}
		sc.close();
	}
	public static int calcNext(ArrayList<Integer> input) {
		int ans;
		int last = input.get(input.size() -1);
		loopn: for (int num = last+1;; num++) {
			for (int i : input) {
				if (num % i == 0) {
					continue loopn;
				}
				if(i==last) {
				ans = num;
				break loopn;
				}
			}
		}
		return ans;
	}
}

