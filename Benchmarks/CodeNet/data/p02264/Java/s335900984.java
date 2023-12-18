
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Queue;
import java.util.Scanner;

class Main {

	public static void main(String[] args) throws Exception {
		//入力と準備
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner scanner = new Scanner(br.readLine());
		int n = scanner.nextInt();
		int quantum = scanner.nextInt();
		scanner.close();
		HashMap<String, Integer> processList = new HashMap<>(n);
		Queue<String> queue = new ArrayDeque<String>(n);
		for(int i=0; i<n; i++) {
			String str = br.readLine();
			scanner = new Scanner(str);
			String name = scanner.next();
			processList.put(name, scanner.nextInt());
			scanner.close();
			queue.add(name);
		}
		int currentTime =  0;
		//順に処理
		for(;;) {
			String task = queue.poll();
			if(task == null)break;
			int time = processList.get(task);
			time -= quantum;
			currentTime += quantum;
			if(time <= 0) {
				currentTime += time;//超過してるので戻す
				System.out.printf("%s %d", task, currentTime);
				System.out.println();
				continue;
			}
			processList.put(task, time);
			queue.add(task);
		}

	}

}

