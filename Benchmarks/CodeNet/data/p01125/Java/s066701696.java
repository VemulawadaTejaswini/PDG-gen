import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String dir;
		int move,N;
		while(true){
			N = sc.nextInt();
			if(N==0) break;
			int x=10,y=10;
			int count=0;

			int[][] jewel = new int[N][N];
			for(int i=0; i<N; i++){
				for(int j=0; j<2; j++){
					jewel[i][j] = sc.nextInt();
				}
			}

			int M = sc.nextInt();
			count = N;

			for(int i=0; i<M; i++){
				dir = sc.next();
				move = sc.nextInt();


				if(dir.equals("N")){
					for(int j=0;j<move;j++){
						y++;
						for(int k=0;k<N;k++){
							if(x==jewel[k][0]&&y==jewel[k][1]) count--;
						}
					}
				}
				else if(dir.equals("E")){
					for(int j=0;j<move;j++){
						x++;
						for(int k=0;k<N;k++){
							if(x==jewel[k][0]&&y==jewel[k][1]) count--;
						}
					}
				}
				else if(dir.equals("S")){
					for(int j=0;j<move;j++){
						y--;
						for(int k=0;k<N;k++){
							if(x==jewel[k][0]&&y==jewel[k][1]) count--;
						}
					}
				}
				else if(dir.equals("W")){		
					for(int j=0;j<move;j++){
						x--;
						for(int k=0;k<N;k++){
							if(x==jewel[k][0]&&y==jewel[k][1]) count--;
						}
					}
				}
			}	
			if(count==0) System.out.println("Yes");
			else if(count>0) System.out.println("No");
		}
	}
}