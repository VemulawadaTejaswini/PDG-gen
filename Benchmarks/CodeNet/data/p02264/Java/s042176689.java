import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] strArray = br.readLine().split(" ");
		
		int n = Integer.parseInt(strArray[0]);
		int q = Integer.parseInt(strArray[1]);
		
		Queue<Process> queue = new ArrayDeque<Process>();
		for(int i = 0; i < n ;i++){
			strArray = br.readLine().split(" ");
			queue.add(new Process(strArray[0], Integer.parseInt(strArray[1])));
		}
		
		int currentTime = 0;
		while(queue.size() > 0){
			if(queue.element().remainTime > q){
				queue.element().remainTime -= q;
				queue.add(queue.poll());
				currentTime += q;
			}
			else{
				currentTime += queue.element().remainTime;
				System.out.println(queue.element().name + " " + currentTime);
				queue.poll();
			}
			
		}
	}

}

class Process {
	String name;
	int remainTime;
	int finishedTime;
	
	public Process (String name, int time){
		this.name = name;
		this.remainTime = time;
	}
}