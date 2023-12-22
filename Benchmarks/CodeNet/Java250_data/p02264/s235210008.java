import java.util.ArrayList;
import java.util.Scanner;


class Process{
	
	private String name;
	private int time;
	public Process(String name,int time){
		this.name = name;
		this.time = time;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	
	
}

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int p = sc.nextInt();
		
		ArrayList<Process> ar = new ArrayList<Process>();
		ArrayList<Process> result = new ArrayList<Process>();
		
		for (int i = 0; i < n; i++) {
			ar.add(new Process(sc.next(),sc.nextInt()));
		}
		
		int totalTime=0,i=0;
		Process process;
		while(true){
			if(i<n){
				if((process=ar.get(i)).getTime()<=p){
					totalTime += process.getTime();
					result.add(new Process(process.getName(), totalTime));
					ar.remove(i);
					n--;
				}
				else{
					totalTime += p;
					int temp =ar.get(i).getTime()-p;
					ar.get(i).setTime(temp);
					i++;
				}
			}
			else{
				i=0;
			}
			if(ar.size()==0){
				break;
			}
		}
		
		for(Process rProcess:result){
			System.out.println(rProcess.getName()+ " "+rProcess.getTime());
		}
		
	}
	
}