import java.util.*;
class Main{
    int dx[]={-1,-1,0,1,1,1,0,-1};
    int dy[]={0,1,1,1,0,-1,-1,-1};

    class P{
	int x,y;
	P(int y,int x){
	    this.x=x;
	    this.y=y;
	}
    }
    void run(){
	Scanner sc=new Scanner(System.in);
	int w,h;
	int [][] map;
	while(true){
	    LinkedList<P> queue=new LinkedList<P>();
	    w=sc.nextInt();
	    h=sc.nextInt();
	    if((w|h)==0)break;
	    map=new int[h+2][w+2];
	    for(int i=1;i<h+1;i++){
		for(int j=1;j<w+1;j++){
		    map[i][j]=sc.nextInt();
		}
	    }
	    int ans=0;
	    for(int i=1;i<h+1;i++){
		for(int j=1;j<w+1;j++){
		
		    if(map[i][j]==1){
			queue.offer(new P(i,j));
			map[i][j]=0;
			ans++;
		    }
		    while(!queue.isEmpty()){
			P p=queue.poll();    
			for(int k=0;k<8;k++){
			    int ny=p.y+dy[k];
			    int nx=p.x+dx[k];
			    if(map[ny][nx]==1){
				queue.offer(new P(ny,nx));
				map[ny][nx]=0;
			    }
			}
		    }
		}
	    }
	    System.out.println(ans);
	}
    }
    public static void main(String[] args){
	new Main().run();
    }
}