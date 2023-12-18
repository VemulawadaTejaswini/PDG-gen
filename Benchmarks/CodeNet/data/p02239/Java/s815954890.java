import java.util.*;

class Queue{
    private int[] que  = new int[10000];
    private int head, tail;

    public void enqueue(int x){
	que[head++]=x;
    }

    public int dequeue(){
	return que[tail++];
    }

    public int getSize(){
	return head-tail;
    }
}

class Main{
    final static int LEN=150;
    final static int NOT_VISIT=-1;

    static int[][] graph = new int[LEN][LEN];
    static int[] d = new int[LEN];

    static Queue que = new Queue();
    static int n, u, k;

    public static void main(String args[]){
	Scanner in = new Scanner(System.in);

	//initialize
	for(int i=0; i<d.length; i++)d[i]=NOT_VISIT;

	n=in.nextInt();
	for(int i=0; i<n; i++){
	    u=in.nextInt();
	    k=in.nextInt();
	    //read vartex informetion
	    for(int j=0; j<k; j++){
		graph[u-1][in.nextInt()-1]=1;
	    }
	}

	//bfs
	d[0]=0;
	bfs(0);
	while(que.getSize()!=0){
	    bfs(que.dequeue());
	}

	//print
	for(int i=0; i<n; i++)System.out.println(i+1+" "+d[i]);
    }

    static void bfs(int i){
	for(int j=0; j<n; j++){
	    if(graph[i][j]==1 && d[j]==NOT_VISIT){
		d[j]=d[i]+1;
		que.enqueue(j);
	    }
	}
    }
}