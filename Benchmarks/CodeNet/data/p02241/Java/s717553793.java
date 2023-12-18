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

	//make prim
	for(int i=0; i<n; i++){
	    int min = Integer.MAX_VALUE;
	    int temp_i=0;
	    int temp_j=0;
	    for(int j=0; j<n; j++){
		if(min>graph[i][j] && graph[i][j]!=-1){
		    temp_i=i;
		    temp_j=j;
		    min=graph[i][j];
		}
	    }
	    prim[temp_i][temp_j]=min;
	}

	//print
	int sum=0;
	int[][] visit = new int[LEN][LEN];
	for(int i=0; i<n; i++){
	    for(int j=0; j<n; j++){
		if(visit[j][i]!=1 && prim[i][j]!=0){
		    visit[i][j]=1;
		    visit[j][i]=1;
		    sum+=prim[i][j];
		}
	    }
	}
	System.out.println(sum);
    }
}