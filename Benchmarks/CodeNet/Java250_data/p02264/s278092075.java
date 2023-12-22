import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayDeque<Process> queue = new ArrayDeque<Process>();
		String[] str01 = br.readLine().split(" ");
		int n = Integer.parseInt(str01[0]);
		int point = Integer.parseInt(str01[1]);
		int sumTime = 0;
		

		for (int i = 0; i < n; i++) {
			String[] str02 = br.readLine().split(" ");
			Process process = new Process(str02[0], Integer.parseInt(str02[1]));
			queue.add(process);
		}
		int i = 0;
		while (true) {
			Process temp = queue.poll();
			if (temp.time <= point) {
				sumTime = sumTime + temp.time;
				temp.time = sumTime;
				System.out.println(temp.name + " " + temp.time);
				i++;
				if(i == n){
					break;
				}
			} else {
				temp.time = temp.time - point;
				queue.add(temp);
				sumTime = sumTime + point;
			}
		}
	}
}

class Process {
	String name;
	int time;

	Process(String name, int time) {
		this.name = name;
		this.time = time;
	}
}