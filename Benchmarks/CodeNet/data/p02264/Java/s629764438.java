
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

class Main {

	/*
	 * 10番目のテストケースでTLEになったのがショックでした
	 */

	public static void main(String[] args) throws Exception {
		//入力と準備
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner scanner = new Scanner(br.readLine());
		int n = scanner.nextInt();
		int quantum = scanner.nextInt();
		scanner.close();
		String name[] = new String[n];
		int time[] = new int[n];
		Queue<Integer> queue = new ArrayDeque<Integer>(n);
		for(int i=0; i<n; i++) {
			scanner = new Scanner(br.readLine());
			name[i] = scanner.next();
			time[i] = scanner.nextInt();
			scanner.close();
			queue.add(i);
		}
		int currentTime =  0;
		//順に処理
		for(;!queue.isEnpty();) {
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

