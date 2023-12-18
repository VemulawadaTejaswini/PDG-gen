import java.util.Scanner;

class Main{
    final static int LEN = 105;
    public static void main(String args[]){
	int[][] graph = new int[LEN][LEN];
	int[][] prim = new int[LEN][LEN];
	int count=0;

	Scanner in = new Scanner(System.in);

	//read
	int n = in.nextInt();
	for(int i=0; i<n; i++){
	    for(int j=0; j<n; j++){
		graph[i][j]=in.nextInt();
	    }
	}

	int[] distance = new int[n];
	int[] go = new int[n];
	int[] visit = new int[n];
	for(int i=0; i<n; i++){
	    distance[i]=Integer.MAX_VALUE;
	    go[i]=-1;
	    visit[i]=-1;
	}

	//make prim
	visit[0]=0;
	int min;
	int temp;
	for(int i=0; i<n; i++){
	    for(int j=0; j<n; j++){
		if(distance[i]>graph[i][j] && graph[i][j]!=-1){
		    distance[i]=graph[i][j];
		    go[i]=j;
		}
	    }	
	}

	//print
	for(int i=0; i<n; i++){
	    if(visit[i]==-1 && visit[go[i]]==-1){
		count+=visit[i];
		visit[i]=0;
	    }
	}
	System.out.println(count);
    }
}