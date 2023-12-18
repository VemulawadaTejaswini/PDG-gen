import java.util.Scanner;


public class Main {

	char[][] makeSpiral(int n){
		char[][] pattern=new char[n][n];
		int dir=0;
		int x=0,y=n-n%2;
		int[] dx={0,1,0,-1};
		int[] dy={-1,0,1,0};
		for(int i=0;i<n;++i){
			for(int j=0;j<n;++j){
				pattern[i][j]=' ';
			}
		}
		int notTurn=2;
		boolean end=false;
		while(!end){

			if(n%2==0||notTurn<2){
				x+=dx[dir];
				y+=dy[dir];
			}
			--notTurn;
			
			switch(dir){
			case 0:
				if(y<=0||(y!=1&&pattern[x][y-2]=='#')){
					if(notTurn>0){
						end=true;
					}
					else{
						dir=1;
						notTurn=2;
					}
				}
				break;
			case 1:
				if(x>=n-1||(x!=n-2&&pattern[x+2][y]=='#')){
					if(notTurn>0){
						end=true;
					}
					else{
						dir=2;
						notTurn=2;
					}
				}
				break;
			case 2:
				if(y>=n-1||(y!=n-2&&pattern[x][y+2]=='#')){
					if(notTurn>0){
						end=true;
					}
					else{
						dir=3;
						notTurn=2;
					}
				}
				break;
			case 3:
				if(x<=0||(x!=1&&pattern[x-2][y]=='#')){
					if(notTurn>0){
						end=true;
					}
					else{
						dir=0;
						notTurn=2;
					}
				}
				break;
			}
			pattern[x][y]='#';
		}
		return pattern;
	}
	
	void io(){
		Scanner s=new Scanner(System.in);
		int setnum=s.nextInt();
		for(int i=0;i<setnum;++i){
			int n=s.nextInt();
			char[][] pattern=makeSpiral(n);
			
			if(i>0)System.out.println();
			for(int y=0;y<n;++y){
				for(int x=0;x<n;++x){
					System.out.print(pattern[x][y]);
				}
				System.out.println();
			}
		}
		s.close();
	}

	public static void main(String[] args) {
		new Main().io();
	}

}