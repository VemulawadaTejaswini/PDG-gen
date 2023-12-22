import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {
		String[] list = br.readLine().split(" ");
		int n = Integer.parseInt(list[0]);
		int q = Integer.parseInt(list[1]);
		
		Deque<ALDS1_3_B_Process> deque = new ArrayDeque<>();
		
		for(int i = 0; i < n; i++){
			list = br.readLine().split(" ");
			String name = list[0];
			int time = Integer.parseInt(list[1]);
			deque.addLast(new ALDS1_3_B_Process(name, time));
		}
		
		int timer = 0;
		
		while(!deque.isEmpty()){
			ALDS1_3_B_Process process = deque.pollFirst();
			int time = process.getTime();
			if(time <= q){
				timer += time;
				System.out.println(process.getName() + " " + timer);
			}else{
				timer += q;
				time -= q;
				process.setTime(time);
				deque.offerLast(process);
			}
		}
		
	}
}

class ALDS1_3_B_Process{
	private String name;
	private int time;
	
	public ALDS1_3_B_Process(String name, int time) {
		this.name = name;
		this.time = time;
	}

	public String getName() {
		return name;
	}

	public int getTime() {
		return time;
	}
	
	public void setTime(int time){
		this.time = time;
	}
}
