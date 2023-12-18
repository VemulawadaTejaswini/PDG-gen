import java.util.*;
public class Main {
	
	Scanner sc = new Scanner(System.in);
	int n,q;
	int nowtime=0;
	Integer process;
	String name;
	
	Queue<String> jobname = new ArrayDeque<String>();
	Queue<Integer> queue = new ArrayDeque<Integer>();
	
	Queue<String> finishjob = new ArrayDeque<String>();
	Queue<Integer> finish = new ArrayDeque<Integer>();
	
	public void input() {
		n = sc.nextInt();
		q = sc.nextInt();
		for(int i=0; i<n; i++) {
			jobname.add( sc.next() );
			queue.add( sc.nextInt() );
		}
	}
	
	public void queue() {
		while(true) {
			process = queue.poll();
			if(process == null) break; //キューがnullなら終了
			if(q >= process) { //プロセスの終了
				nowtime += process;
				name = jobname.poll();
				finish.add(nowtime);
				finishjob.add(name);
			}else { //タイムクオンタムを超えた
				nowtime += q;
				name = jobname.poll();
				queue.add( process-q );
				jobname.add(name);
			}
		}
	}
	
	public void output() {
		while(true) {
			name = finishjob.poll();
			process = finish.poll();
			if(name == null || process == null) break;
			System.out.println(name+" "+process);
		}
	}
	
	public static void main(String[] args) {
		Main obj = new Main();
		obj.input();
		obj.queue();
		obj.output();
	}
}

