import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] tmp =  br.readLine().split(" ");

		int n = Integer.parseInt(tmp[0]);
		int qTime = Integer.parseInt(tmp[1]);

		Process[] pAry = new Process[n+1];

		for(int i = 0 ; i < n ; i++){
			tmp =  br.readLine().split(" ");
			pAry[i] = new Process(tmp[0],Integer.parseInt(tmp[1]));
		}

		boolean isFinished = false;
		int top = 0;
		int tail = n;
		int cureentTime = 0;

		while(!isFinished){

			if(pAry[top].time - qTime <= 0){
				cureentTime += pAry[top].time;
				System.out.println(pAry[top].name + " " + cureentTime );
			}else{
				pAry[top].time -= qTime;
				pAry[tail] = pAry[top];
				tail = (tail + 1) % (n + 1);
				cureentTime += qTime;
			}
			top = (top + 1) % (n + 1);
			if(top == tail){
				isFinished = true;
			}
		}
	}
}

class Process {

	public Process(String name,int time) {
		this.name = name;
		this.time = time;
	}

	public String name;
	public int time;
}