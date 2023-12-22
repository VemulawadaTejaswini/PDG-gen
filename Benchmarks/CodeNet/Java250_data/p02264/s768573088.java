
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.ConcurrentLinkedQueue;

class Main {

	/*
	 * 最初は10番目のテストケースでTLEになったのがショックでした
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
		Queue<Integer> queue = new ConcurrentLinkedQueue<Integer>();
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
			Integer taskNo = queue.poll();
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


