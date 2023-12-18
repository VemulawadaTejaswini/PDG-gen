import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class Main{
	public static void main(String[] args) throws IOException{
		Scanner in = new Scanner(System.in);
		while(true){
			int t = in.nextInt();
			int p = in.nextInt();
			int r = in.nextInt();
			if(t == 0) break;
			Team[] team = new Team[t];
			for(int i=0; i<t; i++)
				team[i] = new Team(i, p);
			for(int i=0; i<r; i++){
				int tid = in.nextInt()-1;
				int pid = in.nextInt()-1;
				int time = in.nextInt();
				String mes = in.next();
				if(mes.equals("CORRECT")){
					team[tid].solved++;
					team[tid].time += time + team[tid].prob[pid]*1200;
				}else{
					team[tid].prob[pid]++;
				}
			}
			Arrays.sort(team);
			for(int i=0; i<t; i++){
				System.out.println(team[i]);
			}
		}
	}
}

class Team implements Comparable<Team>{
	int id;
	int time;
	int solved;
	int[] prob;
	public Team(int id, int p){
		this.id = id;
		prob = new int[p];
	}
	
	@Override
	public int compareTo(Team o) {
		if(solved != o.solved) return o.solved-solved;
		if(time != o.time) return time - o.time;
		return id - o.id;
	}
	
	public String toString(){
		return (id+1)+" "+solved+" "+time;
	}
}