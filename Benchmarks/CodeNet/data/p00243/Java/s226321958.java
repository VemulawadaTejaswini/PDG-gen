import java.util.*;

class P{

    int count;int[][] b;
    public P(int count,int[][] b){
	this.count=count;this.b=b;
    }
}

class Main{

    int[] dx={1,0,-1,0};
    int[] dy={0,1,0,-1};
    int INF=1<<28;
    int w,h;
    boolean debug=false;


    void run(){
	Scanner sc=new Scanner(System.in);

	while(true){
	    w=sc.nextInt();h=sc.nextInt();
	    if((w|h)==0)break;

	    int[][] b=new int[h+2][w+2];
	    for(int i=1;i<h+1;i++){
		for(int j=1;j<w+1;j++){
		    char c=sc.next().charAt(0);
		    switch(c){
		    case 'R':{b[i][j]=1;break;}
		    case 'G':{b[i][j]=2;break;}
		    case 'B':{b[i][j]=3;break;}
		    }
		}
	    }

	    LinkedList<P> q=new LinkedList<P>(); 
	    q.offer(new P(0,b));

	    while(!q.isEmpty()){
		P p=q.poll();
		if(debug){System.out.printf("p.count=%d \n",p.count);
		    for(int i=0;i<h+2;i++){
			for(int j=0;j<w+2;j++){
			    System.out.print(p.b[i][j]);
			}
			System.out.println();
		    }
		    System.out.println();
		}



		if(finished(p.b)){System.out.println(p.count);break;}

	
		for(int t=1;t<=3;t++){
		    if(p.b[1][1]==t)continue;

		    int[][] bb=new int[h+2][w+2];
		    for(int i=0;i<h+2;i++)for(int j=0;j<w+2;j++)bb[i][j]=p.b[i][j];

		    changecolor(bb,t);
		    q.offer(new P(p.count+1,bb));
		}
	    }

	}
    }
  

    boolean finished(int[][] b){
	int c=b[1][1];
	for(int i=1;i<h+1;i++)for(int j=1;j<w+1;j++)if(b[i][j]!=c)return false;

	return true;
    }

    void changecolor(int[][] b,int c){
	int k=b[1][1];
	b[1][1]=c;
	LinkedList<int[]> q=new LinkedList<int[]>();
	q.offer(new int[]{1,1});

	while(!q.isEmpty()){
	    int[] a=q.poll();
	    int x=a[0];int y=a[1];
	    for(int i=0;i<4;i++){
		int nx=x+dx[i];int ny=y+dy[i];
		if(b[ny][nx]==k){
		    b[ny][nx]=c;
		    q.offer(new int[]{nx,ny});
		}
	    }
	}
    }

  
    public static void main(String[] args){
	new Main().run();
    }
}