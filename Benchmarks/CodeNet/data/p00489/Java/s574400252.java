import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    int n, a, b, c, d;
    Team[] team;
    int[] re;

    void run(){
	while(sc.hasNext()){
	    n = sc.nextInt();
	    re = new int[n];
	    team = new Team[n];
	    for(int i=0; i<n; i++)
		team[i] = new Team(i+1);

	    for(int i=0; i<(n*(n-1))/2; i++){
		a = sc.nextInt()-1;
		b = sc.nextInt()-1;
		c = sc.nextInt();
		d = sc.nextInt();

		if(c>d){
		    team[a].result(3);
		    team[b].result(0);
		}
		else if(c==d){
		    team[a].result(1);
		    team[b].result(1);
		}
		else{
		    team[a].result(0);
		    team[b].result(3);
		}
	    }

	    Arrays.sort(team, new Comparator<Team>(){
		    public int compare(Team a, Team b){
			int x1 = a.getPoint();
			int x2 = b.getPoint();
			return x2-x1;
		    }
		}
		);

	    int prev = -1;
	    int rank = 1;
	    int tmp = 0;
	    for(int i=0; i<n; i++){
		int num = team[i].getNumber()-1;
		int p = team[i].getPoint();
		//System.out.println((num+1)+" "+p);
		if(prev==-1)
		    re[num] = rank;
		else if(p==prev){
		    re[num] = rank;
		    tmp++;
		}
		else{
		    rank += (tmp+1);
		    re[num] = rank;
		    tmp = 0;
		}
		prev = p;
	    }

	    for(int i=0; i<n; i++)
		System.out.println(re[i]);
	}
    }

    class Team{
	int number, point;
	Team(int n){
	    number = n;
	    point = 0;
	}
	void result(int p){ point += p; }
	int getPoint(){ return point; }
	int getNumber(){ return number; }
    }
}