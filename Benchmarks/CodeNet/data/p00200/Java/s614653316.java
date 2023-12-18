import java.util.*;
class Main{

    int INF=1<<28;
    int[][] cost,time;

    void run(){

	Scanner sc=new Scanner(System.in);

	while(true){
	int n=sc.nextInt();int m=sc.nextInt();
	if((n|m)==0)break;

	cost=new int[m][m];
	time=new int[m][m];
	for(int i=0;i<m;i++)for(int j=0;j<m;j++){
		cost[i][j]=INF;time[i][j]=INF;
	    }

	for(int i=0;i<n;i++){
	    int a=sc.nextInt()-1;int b=sc.nextInt()-1;
	    cost[a][b]=cost[b][a]=sc.nextInt();
	    time[a][b]=time[b][a]=sc.nextInt();
	}

	for(int k=0;k<m;k++){
	    for(int i=0;i<m;i++){
		for(int j=0;j<m;j++){
		    cost[i][j]=Math.min(cost[i][j],cost[i][k]+cost[k][j]);
		    time[i][j]=Math.min(time[i][j],time[i][k]+time[k][j]);
		}}}

	int z=sc.nextInt();
	for(int i=0;i<z;i++){
	    int p=sc.nextInt()-1;int q=sc.nextInt()-1;int r=sc.nextInt();
	    if(r==0){//cost
		System.out.println(cost[p][q]);
	    }else{//time
		System.out.println(time[p][q]);
	    }
	}
	}
    }
    public static void main(String[] args){
	new Main().run();
    }
}