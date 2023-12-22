import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// 提出時にclass Main に書き換え
public class Main {
	public static void main(String[] args)  {
		// かがみもちの直径を格納するセットd
		Set<Integer> d = new HashSet<Integer>();
		// 標準入力を受け取る
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // int Nを受け取る
		for(int i=0; i < N; i++) {
			int di = sc.nextInt(); // int diを受け取る
			d.add(di); // diをセットdに格納（重複した値は無視）
		}
		sc.close(); // 標準入力を終了

		// d.size()を出力
		System.out.println(d.size());
	}

}