import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static final int BIG_NUM = 2000000000;
	public static final int MOD = 1000000007;

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		final int size = 100005;
		
		try {
			String[] input_str = br.readLine().split("\\s+");
			int n = Integer.parseInt(input_str[0]);
			int q = Integer.parseInt(input_str[1]);
			int elapse = 0;
			Queue queue = new Queue(size);
			StringBuilder ans = new StringBuilder();
			
			for(int i=0; i<n; i++) {
				input_str = br.readLine().split("\\s+");
				queue.push(new Process(input_str[0], Integer.parseInt(input_str[1])));
			}
			
			while(!queue.isEmpty()) {
				Process tmp = queue.pop();
				if(tmp.getTime() <= q) {
					elapse += tmp.getTime();
					ans.append(tmp.getName()).append(" ").append(Integer.toString(elapse)).append("\n");
				} else {
					elapse += q;
					tmp.setTime(tmp.getTime() - q);
					queue.push(tmp);
				}
			}
			System.out.print(ans.toString());
		} catch (NumberFormatException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}
}

class Process{
	private String name;
	private int t;
	
	Process(String arg_name, int arg_time){
		name = arg_name;
		t = arg_time;
	}
	
	public String getName() {
		return name;
	}
	
	public int getTime() {
		return t;
	}
	
	public void setTime(int arg_time) {
		t = arg_time;
	}
}

class Queue{
	private Process[] table;
	private int head, tail, size;
	
	Queue(int arg_size) {
		size = arg_size;
		table = new Process[size];
		head = 0;
		tail = 0;
	}
	
	boolean isEmpty() {
		return head == tail;
	}
	
	void push(Process process) {
		table[tail] = process;
		tail = (tail+1)%size;
	}
	
	public Process pop() {
		head = (head+1)%size;
		return table[(head-1+size)%size];
	}
}
