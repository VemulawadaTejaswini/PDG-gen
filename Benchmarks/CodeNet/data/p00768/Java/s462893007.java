import java.util.*;
class Main{
    public static void main(String []args){
	Scanner sc = new Scanner(System.in);
	int m = sc.nextInt();
	int t = sc.nextInt();
	int p = sc.nextInt();
	int r = sc.nextInt();
	while (!(m == 0 && t == 0 && p == 0 && r == 0)){
	    Team []team = new Team[t+1];
	    for(int i=0;i<team.length;i++){
		team[i]=new Team(p);
	    }
	    for(int i=0;i<r;i++){
		int min =sc.nextInt();
		int teamCount = sc.nextInt();
		int problem = sc.nextInt();
		int judge = sc.nextInt();
		if(judge == 0){
		    team[teamCount].success(problem,min);
		}else{
		    team[teamCount].wrong(problem);
		}
	    }

	    String[][] rank = new String[p+1][m+1];
	    for(int i=team.length-1;i>0;i--){
		if(rank[team[i].count][team[i].time] ==null){
		    rank[team[i].count][team[i].time] = i+"";
		}else{
		    rank[team[i].count][team[i].time] =rank[team[i].count][team[i].time] + "=" +i;
		}
	    }
	    String res = "";
	    for(int i=rank.length-1;i>=0;i--){
		for(int j=0;j<rank[i].length;j++){
		    if(rank[i][j] !=null){
			res += rank[i][j]+",";
		    }
		}
	    }
	    System.out.println(res.substring(0, res.length() - 1));


	    m = sc.nextInt();
	    t = sc.nextInt();
	    p = sc.nextInt();
	    r = sc.nextInt();
	}
    }

}
class Team {
     int count;
     int time;
     int penaltytime;
     int [] pro;
    Team(int problemCount){
	count = 0;
	time = 0;
	penaltytime = 0;
	pro = new int[problemCount];
    }
     void wrong(int problemNumber){
	pro[problemNumber-1]++;
    }
     void success(int problemNumber,int min){
	penaltytime = pro[problemNumber-1]*20;
	time += (min+penaltytime);
	count++;
    }
}