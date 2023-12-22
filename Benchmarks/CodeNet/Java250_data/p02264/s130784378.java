
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;


public class Main{

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int num = Integer.parseInt(line.substring(0, line.indexOf(" ")));
        int q = Integer.parseInt(line.substring(line.indexOf(" ") + 1));
        Deque<Process> deque = new ArrayDeque<Process>();

        for(int i = 0; i < num; i++){
        	line = br.readLine();
        	String name = line.substring(0, line.indexOf(" "));
        	int time = Integer.parseInt(line.substring(line.indexOf(" ") + 1));
        	deque.addLast(new Process(name, time));
        }

        int maxTime = 0;
        Deque<Process> resultDeque = new ArrayDeque<Process>();
        while(!deque.isEmpty()){
        	Process p = deque.pollFirst();
        	if(p.time > q){
        		p.time -= q;
        		maxTime += q;
        		deque.addLast(p);
        	}else{
        		maxTime += p.time;
        		p.time = maxTime;
        		resultDeque.addLast(p);
        	}
        }

        for(Process result: resultDeque){
        	System.out.println(result.name + " " + result.time);
        }


    }
}

class Process{
	String name;
	int time;

	Process(String name, int time){
		this.name = name;
		this.time = time;
	}

}
