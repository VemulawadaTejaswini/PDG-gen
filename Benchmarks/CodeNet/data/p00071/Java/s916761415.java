import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()){
			int n = sc.nextInt();
			for(int a=1;a<=n;a++){
				int[][] map = new int[8][8];
				String s = "";
				for(int i=0;i<8;i++){
					s = sc.next();
					for(int j=0;j<8;j++){
						if(s.codePointAt(j)==49)map[i][j]=1;
					}
				}
				
				ArrayDeque<Integer> px = new ArrayDeque<Integer>();
				ArrayDeque<Integer> py = new ArrayDeque<Integer>();
				px.push(sc.nextInt()-1);
				py.push(sc.nextInt()-1);
				
				int x, y;
				while(true){
					int k = px.size();
					if(k==0)break;
					for(int i=0;i<k;i++){
						x = px.pop();
						y = py.pop(); 
						map[y][x]=0;
						
						for(int j=1;j<4;j++){
							if(x+j==8)break;
							if(map[y][x+j]==1){
								py.push(y);
								px.push(x+j);
							}
						}
						
						for(int j=1;j<4;j++){
							if(x-j==-1)break;
							if(map[y][x-j]==1){
								py.push(y);
								px.push(x-j);
							}
						}
						
						for(int j=1;j<4;j++){
							if(y+j==8)break;
							if(map[y+j][x]==1){
								py.push(y+j);
								px.push(x);
							}
						}
						
						for(int j=1;j<4;j++){
							if(y-j==-1)break;
							if(map[y-j][x]==1){
								py.push(y-j);
								px.push(x);
							}
						}
						
					}
				}
				System.out.println("Data " + a + ":");
				for(int i=0;i<8;i++){
					for(int j=0;j<8;j++){
						System.out.print(map[i][j]);
					}
					System.out.println();
				}
			}
		}
	
	}	
}