import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Team implements Comparable<Team>{
	int passCnt = 0;
	int time = 0;
	int num;
	ArrayList<Integer> wrongAnswer = new ArrayList<Integer>();
	
	Team(int num){
		this.num = num;
	}
	
	void record(int time, int questionNum,int isPassed){
				
		if(isPassed == 0){
			passCnt++;
			this.time += time + 20*getPenalty(questionNum);
		} else wrongAnswer.add(questionNum);
	}
	@Override
	public int compareTo(Team that) {
		if(this.passCnt == that.passCnt){
			if(this.time == that.time){
				return that.num - this.num;
			}else return this.time - that.time;
		} else{
			return that.passCnt - this.passCnt;
		}
	}
	
	boolean equals(Team that){
			return this.passCnt == that.passCnt && this.time == that.time;
	}
	
	public String toString(){
		return this.num+"";
	}
	
	int getPenalty(int questionNum){
		int cnt = 0;
		for(int i : wrongAnswer)
			if(i == questionNum) cnt++;
		return cnt;
	}
	
}


public class Main {
	public static void main(String[] args){
		Scanner sn = new Scanner(System.in);
		int teamNum = 0 ,n = 0;
		while(true){
			int k = sn.nextInt();
			teamNum = sn.nextInt();
			int qn = sn.nextInt();
			n = sn.nextInt();
			if(k == 0 && teamNum == 0 && qn == 0 && n == 0) break;
			Team[] teams = new Team[teamNum];
			for(int i = 0; i < teamNum; i++) teams[i] = new Team(i+1);
			for(int i = 0; i < n; i++){
				int time = sn.nextInt();
				teams[sn.nextInt()-1].record(time, sn.nextInt(), sn.nextInt());
			}
			Arrays.sort(teams);
			System.out.println(getResult(teams));
		}
	}
	
	static String getResult(Team[] ts){
		String out = ts[0].toString();
		for(int i = 1; i < ts.length; i++){
			if(ts[i-1].equals(ts[i])){
				out += "=" + ts[i];
			} else out += "," + ts[i].num;
		}
		return out;
	}
}