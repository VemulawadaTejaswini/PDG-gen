import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

// Integral Rectangles
// 2013/08/13
public class Main{
	Scanner sc=new Scanner(System.in);

	int INF=1<<28;
	double EPS=1e-12;

	int nTeams, nProblems, nTick;
	int[] ticks, teams, problems, results;

	void run(){
		for(;;){
			sc.nextInt();
			nTeams=sc.nextInt();
			nProblems=sc.nextInt();
			nTick=sc.nextInt();
			ticks=new int[nTick];
			teams=new int[nTick];
			problems=new int[nTick];
			results=new int[nTick];
			for(int i=0; i<nTick; i++){
				ticks[i]=sc.nextInt();
				teams[i]=sc.nextInt()-1;
				problems[i]=sc.nextInt()-1;
				results[i]=sc.nextInt();
			}
			solve();
		}
	}

	void solve(){
		int[][] states=new int[nTeams][nProblems];
		int[][] times=new int[nTeams][nProblems];
		for(int i=0; i<nTick; i++){
			if(results[i]==0){
				states[teams[i]][problems[i]]=1;
				times[teams[i]][problems[i]]+=ticks[i];
			}else{
				times[teams[i]][problems[i]]+=20;
			}
		}
		int[] ACs=new int[nTeams];
		int[] penalties=new int[nTeams];
		for(int j=0; j<nTeams; j++){
			for(int i=0; i<nProblems; i++){
				ACs[j]+=states[j][i];
				penalties[j]+=states[j][i]*times[j][i];
			}
		}
		// debug("AC", AC);
		// debug("pena", pena);
		int[] _=new int[nTeams];
		for(int i=0; i<nTeams; i++){
			_[i]=i;
		}
		for(int i=0; i<nTeams; i++){
			for(int j=i+1; j<nTeams; j++){
				if(comp(ACs[_[i]], penalties[_[i]], _[i], ACs[_[j]],
						penalties[_[j]], _[j])>0){
					int t=_[i];
					_[i]=_[j];
					_[j]=t;
				}
			}
		}
		// debug(_);
		for(int i=0; i<nTeams; i++){
			print(1+_[i]+"");
			if(i<nTeams-1){
				print(comp(ACs[_[i]], penalties[_[i]], ACs[_[i+1]],
						penalties[_[i+1]])==0?"=":",");
			}
		}
		println("");
	}

	int comp(int ac1, int time1, int ac2, int time2){
		if(ac1!=ac2){
			return -(ac1-ac2);
		}else{
			return time1-time2;
		}
	}

	int comp(int ac1, int time1, int id1, int ac2, int time2, int id2){
		if(comp(ac1, time1, ac2, time2)!=0){
			return comp(ac1, time1, ac2, time2);
		}else{
			return -(id1-id2);
		}
	}

	void debug(Object... os){
		System.err.println(Arrays.deepToString(os));
	}

	void print(String s){
		System.out.print(s);
	}

	void println(String s){
		System.out.println(s);
	}

	public static void main(String[] args){
		new Main().run();
	}
}