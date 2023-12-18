import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

class Main {

	/*
	 * 最初は10番目のテストケースでTLEになったのがショックでした。
	 * 色々と考えてオートボクシングやアンボクシングの処理をなるだけ減らしたり
	 * 違うキューのクラスを使う事も考えましたが、
	 * インターネットで調べたところJavaのScannerを使った処理が重いということが判明しました。
	 * Scanner#nextInt()を使わないことでACになりました。
	 *
	 * 参考にしたサイト：
	 * Java競技プログラミングメモ-Quita
	 * https://qiita.com/p_shiki37/items/65c18f88f4d24b2c528b
	 * 2019/5/28閲覧
	 */

	public static void main(String[] args) throws Exception {
		//入力と準備
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner scanner = new Scanner(br.readLine());
		int n = Integer.parseInt(scanner.next());
		int quantum = Integer.parseInt(scanner.next());
		scanner.close();
		String name[] = new String[n];
		int time[] = new int[n];
		Queue<Integer> queue = new ArrayDeque<Integer>();
		for(int i=0; i<n; i++) {
			scanner = new Scanner(br.readLine());
			name[i] = scanner.next();
			time[i] = Integer.parseInt(scanner.next());
			scanner.close();
			queue.add(i);
		}
		int currentTime =  0;
		//順に処理
		for(;!queue.isEmpty();) {
			int taskNo = queue.poll();
			time[taskNo] -= quantum;
			currentTime += quantum;
			if(time[taskNo] <= 0) {
				currentTime += time[taskNo];//超過しているので戻す
				System.out.println(name[taskNo]+" "+String.valueOf(currentTime));
				continue;
			}
			queue.add(taskNo);
		}

	}

}

