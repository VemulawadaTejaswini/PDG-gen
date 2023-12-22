import java.util.*;
import java.text.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int field[][] = new int[21][21];
		while(true){
			for(int i=0; i<21; i++){
				for(int j=0; j<21; j++){
					field[i][j] = 0;
				}
			}
			int N = in.nextInt();
			if(N == 0) break;
			for(int i=0; i<N; i++){
				int x = in.nextInt();
				int y = in.nextInt();
				field[x][y] = 1;
			}
			
			int x = 10;
			int y = 10;
			int M = in.nextInt();
			int jewel = 0;
			for(int i=0; i<M; i++){
				String str = in.next();
				int d=9;
				if(str.equals("N")) d=0;
				else if(str.equals("S")) d=1;
				else if(str.equals("E")) d=2;
				else if(str.equals("W")) d=3;
				int l = in.nextInt();
				switch(d){
				case 0:
					for(int j=0; j<=l; j++){
						if(field[x][y+j]==1){
							field[x][y+j]=0;
							jewel++;
						}
					}
					y=y+l;
					break;
				case 1:
					for(int j=0; j<=l; j++){
						if(field[x][y-j]==1){
							field[x][y-j]=0;
							jewel++;
						}
					}
					y=y-l;
					break;
				case 2:
					for(int j=0; j<=l; j++){
						if(field[x+j][y]==1){
							field[x+j][y]=0;
							jewel++;
						}
					}
					x=x+l;
					break;
				case 3:
					for(int j=0; j<=l; j++){
						if(field[x-j][y]==1){
							field[x-j][y]=0;
							jewel++;
						}
					}
					x=x-l;
					break;
				}				
			}
			
			if(jewel == N) System.out.println("Yes");
			else System.out.println("No");
			
		}
	}	
}