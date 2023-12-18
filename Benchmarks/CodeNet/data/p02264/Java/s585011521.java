
import java.util.Scanner;

/*
 * ??\?????????
5 100
p1 150
p2 80
p3 200
p4 350
p5 20
 */
public class Main{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int totalTime = 0;
        int n = scanner.nextInt();
        int q = scanner.nextInt();
        
        int[] A = new int[n];
        Queue queue = new Queue(n);
        
        for(int i=1;i<=n;i++){
            Process process = new Process(scanner.next(),scanner.nextInt());
            queue.enqueue(process);
        }
        while(true){
        	Process p= queue.dequeue();
        	if(p==null){
        		break;
        	}
        	int time =p.getProcessTime();
        	int remainingTime = time-q;
        	if(remainingTime <=0){
        		totalTime += time;
        		System.out.println(p.getProcessName()+" "+totalTime);
        	}else{
        		totalTime += q;
        		p.setProcessTime(time-q);
        		queue.enqueue(p);
        	}
        }
    }
}
class Queue{
	int startIndex;
	int endIndex;
	int size;
    String[] queueName;
    int[] queueTime;
    
	Queue(int n){
    	startIndex =0;
    	endIndex = 0;
    	size = n;
        queueName = new String[n];
        queueTime = new int[n];
	}
	void enqueue(Process process){
		//System.out.println("??¨????????\???"+process.getProcessName()+","+process.getProcessTime());

		queueName[endIndex]=process.getProcessName();
		queueTime[endIndex]=process.getProcessTime();
		endIndex++;
		endIndex %= size;
	}
	Process dequeue(){
		//System.out.println("????????\???"+queueName[startIndex]+","+queueTime[startIndex]);
		if(queueName[startIndex].equals("")){
			return null;
		}
		Process process = new Process(queueName[startIndex],queueTime[startIndex]);
		queueName[startIndex]="";
		startIndex++;
		startIndex %= size;
		return process;
	}
}

class Process{
	private String processName;
	private int processTime;
	Process(String processName,int processTime){
		this.processName = processName;
		this.processTime = processTime;
	}
	String getProcessName(){
		return processName;
	}
	void setProcessName(String processName){
		this.processName = processName;
	}
	public int getProcessTime() {
		return processTime;
	}
	public void setProcessTime(int processTime) {
		this.processTime = processTime;
	}

	
}