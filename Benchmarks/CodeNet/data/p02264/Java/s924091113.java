import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		String str[] = r.readLine().split(" ");
		int max = Integer.parseInt(str[0]);
		Queue q = new Queue(max);
		int qtime = Integer.parseInt(str[1]);

		for(int i = 0 ; i < max ; i++ ){
			str = r.readLine().split(" ");
			q.enqueue(new Process(str[0], Integer.parseInt(str[1])));
		}

		int elapsedTime = 0;

		//?????\?????¬????????§???
		while(true){
			if(q.isEmpty()) break;
			Process p = q.dequeue();
			int time = p.getTime();

			if(time <= qtime){
				elapsedTime+= time;
				System.out.println(p.getName() +" "+elapsedTime);
			}else{
				p.setTime(time - elapsedTime);
				elapsedTime += qtime;
			}

		}
	}

}

class Queue{

	Process[] processAry;
	int top;
	int tail;
	int max;

	public Queue(int max){
		top = tail = 0;
		processAry = new Process[max];
		this.max = max;
	}

	public void enqueue(Process process) throws Exception{
		if(isFull()){
			throw new Exception("FULL");
		}else{
			processAry[top] = process;
			top = top + 1 % max;
		}
	}

	public Process dequeue() throws Exception{
		if(isEmpty()){
			throw new Exception("EMPTY");
		}else{
			Process p = processAry[tail];
			tail = tail + 1 % max;
			return p;
		}

	}

	public boolean isFull(){
		return tail == top + 1 % max;
	}

	public boolean isEmpty(){
		return top == tail;
	}
}

class Process{
	private String name;
	private int time;

	public Process(String name,int time) {
		this.name = name;
		this.time = time;
	}

	public String getName() {
		return name;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

}