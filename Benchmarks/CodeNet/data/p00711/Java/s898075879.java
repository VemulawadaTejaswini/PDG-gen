import java.util.*;
class Main
{
    int dx[]={-1,0,1,0};
    int dy[]={0,1,0,-1};
    char[][] map;
    void run()
    {
	Scanner sc=new Scanner(System.in);
	while(true){
	    int W=sc.nextInt();
	    int H=sc.nextInt();sc.nextLine();
	    if(W==0&&H==0)break;
	    
	    int startX=0,startY=0;
	    map=new char[H+2][W+2];
	    for(int i=0;i<H+2;i++){
		Arrays.fill(map[i],'#');
	    }
	    for(int i=1;i<H+1;i++){
		char[] s=sc.next().toCharArray();
		for(int j=0;j<W;j++){	
		    if(s[j]=='@'){
			startY=i;
			startX=j+1;
		    }
		    map[i][j+1]=s[j];	
		}
	    }
	    System.out.println(DFS(startY,startX));
	}
    }
    int DFS(int y,int x)
    {
	if(map[y][x]=='#')return 0;
	map[y][x]='#';
	int sum=1;
	for(int i=0;i<4;i++){
	    sum+=DFS(y+dy[i],x+dx[i]);
	}
	return sum;
    }
    
    public static void main(String[] args)
    {
	new AOJ1130().run();
    }
}